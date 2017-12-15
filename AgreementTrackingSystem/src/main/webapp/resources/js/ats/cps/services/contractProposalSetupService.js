/**
 * Created by Apurbo on 11/15/2017.
 */
angular.module('ats.cps').service('contractProposalSetupService', ['$filter', function ($filter) {
    this.formUrl = "contractProposalSetup";
    console.log('fs');
    this.getNewLink = function () {
        return $ajaxService.get(this.formUrl + '/getSomething');
    }
}]);