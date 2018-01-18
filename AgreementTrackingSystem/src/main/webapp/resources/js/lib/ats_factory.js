/**
 * Created by md.rahman on 11/18/2017.
 */
var app = angular.module('atsFactory', []);

app.factory('fileReader', ['$q', function ($q) {
    var onLoad = function (reader, deferred, scope) {
        return function () {
            scope.$apply(function () {
                deferred.resolve(reader.result);
            });
        };
    };

    var onError = function (reader, deferred, scope) {
        return function () {
            scope.$apply(function () {
                deferred.reject(reader.result);
            });
        };
    };

    var getReader = function (deffered, scope) {
        var reader = new FileReader();
        reader.onload = onLoad(reader, deffered, scope);
        reader.onerror = onError(reader, deffered, scope);
        return reader;
    };

    var readAsDataURL = function (file, scope) {
        var deferred = $q.defer();
        var reader = getReader(deferred, scope);
        reader.readAsDataURL(file);
        return deferred.promise;
    };
    return {
        readAsDataURL: readAsDataURL
    };
}]);