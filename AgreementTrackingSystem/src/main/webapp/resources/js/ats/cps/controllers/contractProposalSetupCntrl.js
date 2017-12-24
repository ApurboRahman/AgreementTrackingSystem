/**
 * Created by Apurbo on 11/15/2017.
 */


/*angular.module('ats.cps').controller('contractProposalSetupCntrl', ['$scope', '$q', '$filter', 'contractProposalSetupService', function ($scope, $q, $filter, contractProposalSetupService) {*/
angular.module('ats.cps').controller('contractProposalSetupCntrl', ['$scope', '$filter', '$q', 'contractProposalSetupService', function ($scope, $filter, $q, contractProposalSetupService) {
    $scope.agreementType = "John";
    $scope.changeName = function () {
        $scope.agreementType = "Nelly";
    };
    console.log('cn');
    $scope.fillOnClick = function () {
        $scope.agreementType = "Govt Type";
        $scope.department = "department";
        $scope.party = "party";
        $scope.adiParty = "adiParty";

    };
    $scope.clearOnClick = function () {
    };
    $scope.getSomething = function () {
        contractProposalSetupService.getSomething().then(

        );
    }

}]);