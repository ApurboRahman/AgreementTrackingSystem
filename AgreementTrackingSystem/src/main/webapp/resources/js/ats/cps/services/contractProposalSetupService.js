/**
 * Created by Apurbo on 11/15/2017.
 */
angular.module('ats.cps').service('contractProposalSetupService', ['$filter', 'ajaxService', function ($filter, ajaxService) {
    this.formUrl = "contractProposal";
    console.log('fs');
    this.getSomething = function () {
        return ajaxService.get(this.formUrl + '/getSomething');
    };

    this.getNewLink = function () {
        return ajaxService.get(this.formUrl + '/getNewLink');
    }
}]);