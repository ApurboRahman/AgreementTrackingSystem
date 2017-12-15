var app = angular.module('ats.cps', []);


app.directive("w3TestDirective", function () {
    return {
        template: "I was made in a directive constructor!"
    };
});