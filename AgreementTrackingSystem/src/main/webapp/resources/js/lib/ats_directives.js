/**
 * Created by md.rahman on 11/18/2017.
 */

var app = angular.module('atsDirectives', ['atsServices']);

app.directive("w3TestDirective", function () {
    return {
        template: "I was made in a directive constructor!"
    };
});

app.directive('financialValueFormat', ['formatService', 'utilityService', function (formatService, utilityService) {
        return {
            require: 'ngModel',
            link: function (scope, element, attrs, ngModelController) {
                element.bind(
                    'keypress', function (e) {
                        var specialChars = [96, 126, 33, 64, 35, 36, 37, 94, 38, 42, 40, 41, 95, 43, 91, 93, 123, 125, 59, 39, 58, 34, 92, 124, 44, 60, 62, 47, 63];
                        if ((e.which >= 97 && e.which <= 127) || (e.which >= 65 && e.which <= 90) || specialChars.indexOf(e.which) > -1)
                            return false;
                        if (e.which === 46) {
                            if (element.va().indexOf('.') > -1)
                                return false;
                        }
                    }
                );
                element.bind(
                    'blur', function () {
                        var initialVal = $(element).val() || '';
                        if (initialVal) {
                            var val = formatService.formatFinancialValue(initialVal);
                            $(element.val(val));
                            if (!val) {
                                errorMsg('Balance Range Exceeds. Ex: ############.####')
                            }
                        }
                    }
                );
                ngModelController.$parsers.push(
                    function (data) {
                        var formattedValue = formatService.formatFinancialValue(data);
                        if (formattedValue) {
                            ngModelController.$viewValue = formattedValue;
                            element.val(ngModelController.$viewValue);
                            return atsGlobal.convertToDecimal(formattedValue);
                        } else {
                            return '';
                        }
                    }
                );
                ngModelController.$formatters.push(
                    function (data) {
                        if (data === 0) {
                            return data;
                        } else {
                            var formattedValue = formatService.formatFinancialValue(data);
                            return formattedValue;
                        }
                    }
                );
            }
        };
    }]
);
app.directive(
    'atsDateFormat', ['formatService', function (formatService) {
        return {
            require: 'ngModel',
            link: function (scope, element, attrs, ngModelController) {
                ngModelController.$parsers.push(
                    function (data) {
                        return formatService.formatGlobalDate(data, 1)
                    }
                );
                ngModelController.$formatters.push(
                    function (data) {
                        return formatService.formatGlobalDate(data)
                    }
                );
            }
        };
    }]
);
app.directive(
    'maskContact', ['formatService', function (formatService) {
        return {
            restrict: 'A',
            require: 'ngModel',
            link: function (scope, element, attrs, ngModelController) {
                element.bind(
                    'blur', function () {
                        $(element).val(formatService.maskContactID($(element).val()));
                    }
                );
                ngModelController.$parsers.push(
                    function (data) {
                        if (data) {
                            var formattedValue = formatService.maskContactID(data.toString());
                            if (!formattedValue) {
                                errorMsg("Invalid Contact Id");
                                element.val('');
                                return formattedValue;
                            }
                            ngModelController.$viewValue = formattedValue;
                            element.val(ngModelController.$viewValue);
                            return formatService.unmask(formattedValue);
                        }
                    }
                );

            }
        };
    }]
);
app.directive(
    'maskCustomer', ['formatService', function (formatService) {
        return {
            restrict: 'A',
            require: 'ngModel',
            link: function (scope, element, attrs, ngModelController) {
                element.bind(
                    'blur', function () {
                        $(element).val(formatService.maskCustomerID($(element).val()));
                    }
                );
                ngModelController.$parsers.push(
                    function (data) {
                        if (data) {
                            var formattedValue = formatService.maskCustomerID(data.toString());
                            if (!formattedValue) {
                                errorMsg("Invalid Customer ID");
                                element.val('');
                                return formattedValue;
                            }
                            ngModelController.$viewValue = formattedValue;
                            element.val(ngModelController.$viewValue);
                            return formatService.unmask(formattedValue);
                        }
                    }
                );
                ngModelController.$formatters.push(
                    function (data) {
                        if (data) {
                            return formatService.maskCustomerID(data.toString());
                        }
                    }
                );
            }
        };
    }]
);

app.directive(
    'maskFinancialGL', ['formatService', function (formatService) {
        return {
            restrict: 'A',
            require: 'ngModel',
            link: function (scope, element, attrs, ngModelController) {
                element.bind(
                    'blur', function () {
                        $(element).val(formatService.maskFinancialGL($(element).val()));
                    }
                );
                ngModelController.$parsers.push(
                    function (data) {
                        if (data) {
                            var formattedValue = formatService.maskFinancialGL(data.toString());
                            if (!formattedValue) {
                                errorMsg("Invalid Financial GL");
                                element.val('');
                                return formattedValue;
                            }
                            ngModelController.$viewValue = formattedValue;
                            element.val(ngModelController.$viewValue);
                            return formatService.unmask(formattedValue);
                        }
                    }
                );
                ngModelController.$formatters.push(
                    function (data) {
                        if (data) {
                            return formatService.maskFinancialGL(data.toString());
                        }
                    }
                );
            }
        };
    }]
);

app.directive(
    'maskGL', ['formatService', function (formatService) {
        return {
            restrict: 'A',
            require: 'ngModel',
            link: function (scope, element, attrs, ngModelController) {
                element.bind(
                    'blur', function () {
                        $(element).val(formatService.maskGL($(element).val()));
                    }
                );
                ngModelController.$parsers.push(
                    function (data) {
                        if (data) {
                            var formattedValue = formatService.maskGL(data.toString());
                            if (!formattedValue) {
                                errorMsg("Invalid GL ");
                                element.val('');
                                return formattedValue;
                            }
                            ngModelController.$viewValue = formattedValue;
                            element.val(ngModelController.$viewValue);
                            return formatService.unmask(formattedValue);
                        }
                    }
                );
                ngModelController.$formatters.push(
                    function (data) {
                        if (data) {
                            return formatService.maskGL(data.toString());
                        }
                    }
                );
            }
        };
    }]
);

app.directive(
    'maskSheetNo', ['formatService', function (formatService) {
        return {
            restrict: 'A',
            require: 'ngModel',
            link: function (scope, element, attrs, ngModelController) {
                element.bind(
                    'blur', function () {
                        $(element).val(formatService.maskSheetNo($(element).val()));
                    }
                );
                ngModelController.$parsers.push(
                    function (data) {
                        if (data) {
                            var formattedValue = formatService.maskSheetNo(data.toString());
                            if (!formattedValue) {
                                errorMsg("Invalid GL ");
                                element.val('');
                                return formattedValue;
                            }
                            ngModelController.$viewValue = formattedValue;
                            element.val(ngModelController.$viewValue);
                            return formatService.unmask(formattedValue);
                        }
                    }
                );
                ngModelController.$formatters.push(
                    function (data) {
                        if (data) {
                            return formatService.maskSheetNo(data.toString());
                        }
                    }
                );
            }
        };
    }]
);

app.directive(
    "ngSelectImage", ['fileReader', function (fileReader) {
        return {
            restrict: 'A',
            scope: {
                callback: '&attributeCallback'
            },
            link: function ($scope, el, attrs) {
                el.bind("change", function (e) {
                    var photographImg = (e.srcElement || e.target).files[0];
                    var count = attrs.attributeCount;

                    var fsize = photographImg.size();
                    var ftype = photographImg.type();
                    if (fsize > 14336) {
                        el.val(null);
                        $scope.$apply();
                        errorMsg('File size must not be greater than 14KB');
                        $scope.callback({count: count, pic: null});
                        return;
                    }
                    if (!(ftype == 'image/png' || ftype == 'image/jpeg' || ftype == 'image/jpg' || ftype == 'image/gif')) {
                        photographImg = '';
                        el.val(null);
                        $scope.$apply();
                        errorMsg('Invalid File type');
                        $scope.callback({count: count, pic: null});
                        return;
                    }

                    fileReader.readAsDataURL(photographImg, $scope)
                        .then(function (result) {
                            $scope.callback({count: count, pic: result});
                        });
                });
            }
        };
    }]
);

app.directive("ngSelectFile", ['fileReader', function (fileReader) {
        return {
            restrict: 'A',
            scope: {
                callback: '&attributeCallback'
                ,
                link: function ($scope, el, attrs) {
                    el.bind("change", function (e) {
                        var selectedFile = (e.srcElement || e.target).files[0];
                        var fsize = selectedFile.size();
                        var ftype = selectedFile.type();
                        if (ftype && ftype != 'application/sql') {//check your required file type
                            var selectedFile = '';
                            el.val(null);
                            $scope.$apply();
                            errorMsg('Invalid File Type');
                            $scope.callback({fileContent: null, fileName: ''});
                            return;
                        }
                        var name = selectedFile.name;
                        var len = name.length - 4;
                        if (name && name.lastIndexOf('.sql') != len) { //check your required file extension
                            selectedFile = '';
                            el.val(null);
                            $scope.$apply();
                            errorMsg('Invalid File extension');
                            $scope.callback({fileContent: null, fileName: ''});
                            return;
                        }

                        fileReader.readAsDataURL(selectedFile, $scope)
                            .then(function (result) {
                                $scope.callback({fileContent: result, fileName: name});
                            });
                    });
                }
            }
        };
    }]
);

app.directive('dynamicHtml', ['$scope', '$compile', function ($scope, $compile) {
    return {
        restrict: 'A',
        replace: true,
        link: function (scope, ele, attrs) {
            scope.$watch(attrs.dynamicHtml, function (html) {
                ele.html(html);
                $compile(ele.contents())(scope);
            });
        }
    };
}]);