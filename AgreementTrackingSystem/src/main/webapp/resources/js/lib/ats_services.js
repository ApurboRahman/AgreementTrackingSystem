/**
 * Created by md.rahman on 11/18/2017.
 */
var app = angular.module('atsServices', []);

app.factory('httpDataIntercept', ['$q', function ($q) {
    function checkStatus(statusCode) {
        switch (statusCode) {
            case 901:
                window.location.href = atsGlobal.baseUrl() + "login";
                break;
            case 500:
                errorMsg()
        }
    }
}]);