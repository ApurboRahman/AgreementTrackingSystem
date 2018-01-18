/**
 * Created by md.rahman on 11/18/2017.
 */
var app = angular.module('atsFilters', []);

/*
 * Filter for formatting the amount as global financial format
 * */
app.filter(
    'formatFinancialValueFilter', ['formatService', function (formatService) {
        return function (input) {
            return formatService.formatFinancialValue(input);
        };
    }]
);

/*
 * Filter for formatting the data as global date format
 */
app.filter(
    'formatGlobalDateFilter', ['formatService', function (formatService) {
        return function (input) {
            return formatService.formatGlobalDateFilter(input);
        };
    }]
);

app.filter(
    'maskContactFilter', ['formatService', function (formatService) {
        return function (input) {
            if (input) {
                return formatService.maskContactID(input);
            }
        };
    }]
);


app.filter(
    'maskCustomerGLFilter', ['formatService', function (formatService) {
        return function (input) {
            if (input) {
                return formatService.maskCustomerGL(input);
            }
        };
    }]
);


app.filter(
    'maskGLFilter', ['formatService', function (formatService) {
        return function (input) {
            if (input) {
                return formatService.maskGL(input);
            }
        };
    }]
);


app.filter(
    'paddingNumber', function () {
        return function (input, n) {
            if (input === undefined)
                input = "";
            if (input.length >= n)
                return input;
            var zeros = "0".repeat(n);
            return (zeros + input).slice(-1 * n);
        };
    }
);

