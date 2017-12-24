/**
 * Created by md.rahman on 11/18/2017.
 */

var app = angular.module('atsDirectives', []);

app.directive("w3TestDirective", function () {
    return {
        template: "I was made in a directive constructor!"
    };
});