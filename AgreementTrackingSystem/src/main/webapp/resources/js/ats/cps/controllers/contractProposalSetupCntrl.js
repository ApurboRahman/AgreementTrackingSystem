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

    $scope.page = {
        formSubmitted: false,
        editable: false,
        editMode: false,
        editableButton: false,
        isSubmitted: false,
        handleSaveButton: false,
        initialize: function () {
            this.formSubmitted = false;
            this.editable = false;
            this.editMode = false;
            this.editableButton = false;
            this.isSubmitted = false;
            this.handleSaveButton = false;

        }
    };
    $scope.contractProposalDTO = {
        serialNo: '',
        contractName: '',
        contractType: '',
        contractBody: '',
        remarks: '',
        agreementType: '',
        department: '',
        party: '',
        adiParty: '',
        initialize: function (data) {
            this.serialNo = data ? data.serialNo || '' : '';
            this.contractName = data ? data.contractName || '' : '';
            this.contractType = data ? data.contractType || '' : '';
            this.contractBody = data ? data.contractBody || '' : '';
            this.remarks = data ? data.remarks || '' : '';
            this.agreementType = data ? data.agreementType || '' : '';
            this.department = data ? data.department || '' : '';
            this.party = data ? data.party || '' : '';
            this.adiParty = data ? data.adiParty || '' : '';
        }
    };
    $scope.fillOnClick = function () {
        $scope.agreementType = "Govt Type";
        $scope.department = "department";
        $scope.party = "party";
        $scope.adiParty = "adiParty";

    };
    $scope.clearOnClick = function () {
    };
    $scope.getSomething = function () {
        var testData = 'test';
        contractProposalSetupService.getSomething(testData).then(
            function (res) {
                console.log("1");
                /*if (res.data.status === 1) {
                 console.log("1");
                 } else {
                 console.log("wrong");
                 }*/
            }
        );
    };

    $scope.getNewLink = function () {
        contractProposalSetupService.getNewLink().then(
            function (res) {
                if (res.data.status === 1) {
                    console.log("1");
                    successMsg(res.data.text);
                } else {
                    console.log("wrong");
                    errorMsg(res.data.text);
                }
            }
        );
    };

    $scope.contractList = [];
    $scope.getContractList = function () {
        contractProposalSetupService.getContractList().then(
            function (res) {
                if (res.data.status === 1) {
                    $scope.contractList = res.data.dto;
                    console.log($scope.contractList);
                } else {
                    console.log("wrong");
                    errorMsg(res.data.text);
                }
            }
        );
    };
    $scope.getContractList();

    $scope.save = function (form) {
        $scope.page.formSubmitted = true;
        /*        if (form.$valid) {
         return false;
         }*/
        if ($scope.page.isSubmitted) {
            return;
        }

        contractProposalSetupService.save().then(
            function (res) {
                if (res.data.status === 1) {
                    console.log("save");
                }
            }
        );
    }
}]);