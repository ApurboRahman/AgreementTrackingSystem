/**
 * Created by Apurbo on 11/15/2017.
 */
angular.module('ats.cps').service('contractProposalSetupService', ['$filter', 'ajaxService', function ($filter, ajaxService) {
    this.formUrl = "contractProposal";
    console.log('fs');
    this.getSomething = function (testData) {
        return ajaxService.get(this.formUrl + '/getSomething', {
            testData: testData
        });
    };
    this.getNewLink = function () {
        return ajaxService.get(this.formUrl + '/getNewLink');
    };

    this.save = function () {
        return ajaxService.post(this.formUrl + '/save');
    }


}]);