/**
 * Created by Apurbo on 11/15/2017.
 */

var app = co.module('cps', []);
app.controller('contractProposalSetupCntrl', function ($scope) {
    $scope.agreementType = "John";
    $scope.changeName = function () {
        $scope.agreementType = "Nelly";
    }
});