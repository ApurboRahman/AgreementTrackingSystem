/**
 * Created by Apurbo on 11/15/2017.
 */


app.controller('contractProposalSetupCntrl', function ($scope) {
    $scope.agreementType = "John";
    $scope.changeName = function () {
        $scope.agreementType = "Nelly";
    };

    $scope.fillOnClick = function () {
        $scope.agreementType = "Govt Type";
        $scope.department = "department";
        $scope.party = "party";
        $scope.adiParty = "adiParty";

    };
    $scope.clearOnClick = function () {
        $scope.agreementType = "";
        $scope.department = "";
        $scope.party = "";
        $scope.adiParty = "";
        alert("clear !!")
    }

});