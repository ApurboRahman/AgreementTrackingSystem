/**
 * Created by md.rahman on 11/18/2017.
 */

var app = angular.module('atsDirectives', ['atsServices']);

app.directive("w3TestDirective", function () {
    return {
        template: "I was made in a directive constructor!"
    };
});

/*
 app.directive("financialValueFormat",['formatService','utilityService',function () {
 return {
 require:'ngModel,
 link:function(scope,element,attrs,ngModelController){
 element.bind('keypress',function(e));
 }
 };
 }]);*/
