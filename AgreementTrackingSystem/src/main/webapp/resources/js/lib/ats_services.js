/**
 * Created by md.rahman on 11/18/2017.
 */
var app = angular.module('atsServices', []);

app.factory('httpDataInterceptor', ['$q', function ($q) {
    function checkStatus(statusCode) {
        switch (statusCode) {
            case 901:
                window.location.href = atsGlobal.baseUrl() + "login";
                break;
            case 500:
                errorMsg("There is unwanted exception. Please contact with ....");
                break;
            case 404:
                errorMsg("Invalid Request -404");
                break;
            case 400:
                errorMsg("Bad Request -400");
                break;
            case 406:
                window.location.href = atsGlobal.baseUrl() + "your customized message";
                break;
            //and so on you can add more if required;
        }

    }

    return {
        request: function (config) {
            config.headers['X-Requested-With'] = 'XMLHttpRequest';
            return config;
        },
        response: function (data) {
            checkStatus(data.status);
            return data;
        },
        responseError: function (data) {
            checkStatus(data.status);
            return data;
        }
    };
}]);

app.config(['$httpProvider', function ($httpProvider) {
    $httpProvider.interceptors.push('httpDataInterceptor');
}]);

app.service(
    'atsGlobalService', [function () {
        this.baseUrl = function () {
            // return window.location.protocol + '//' + window.location.host + '/ats.web/';
            return window.location.protocol + '//' + window.location.host + '/';

        };
    }]
);

app.service('formatService', [function () {
        this.formatFinancialValue = function (data) {
            if (data) {
                if (data > 999999999999.9999) {
                    return '';
                }
                data = data.toString();
                var amountFormat = globalConf.financialValueFormat;
                var amount = '';
                var place = globalConf.decimalPlacesForAmount;
                var divisor = '1' + Array(place).join(0);
                if (data.indexOf(',') === -1) {
                    amount = data;
                } else {
                    amount = data.split(',').join('');
                }
                var roundAmount = Math.floor(Number(amount) * Number(divisor)) / Number(divisor);
                if (amount < 0) {
                    roundAmount = Math.ceil(Number(amount) * Number(divisor)) / Number(divisor);
                }
                var amountParts = roundAmount.toFixed(place - 1).toString().split('.');
                var formatRegx = RegExp(amountFormat, 'g');
                var formatedAmount = '';
                if (amountFormat.indexOf('(') === -1) {
                    formatedAmount = amountParts[0] + (amountParts[1] ? '.' + amountFormat[1] : '');
                } else {
                    formatedAmount = amountParts[0].replace(formatRegx, "$1,") +
                    (amountParts[1] ? '.' + amountParts[1] : '');
                }
                return formatedAmount;
            }
        };

        this.convertAmountInWords = function (data) {
            if (data) {
                return atsGlobal.convertAmountInWord(data);
            }
        };
        this.maskContactID = function (data) {
            return atsGlobal.maskContactID(data);
        };
        this.maskFinancialGL = function (data) {

            if (data) {
                return atsGlobal.maskFinancialGL(data);
            }
        };
    }]
);
app.service(
    'ajaxService', ['$http', 'atsGlobalService', function ($http, atsGlobalService) {
        this.get = function (url, params) {
            return $http(
                {
                    url: atsGlobalService.baseUrl() + url,
                    method: 'GET',
                    params: params
                }
            );
        };

        this.post = function (url, data) {
            var token = $('input[name="_csrf"]').va();
            return $http.pos(atsGlobalService.baseUrl() + url, data, {headers: {'X-CSRF-TOKEN': token}});
        };
    }]
);
