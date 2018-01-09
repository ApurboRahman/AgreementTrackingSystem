<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 11/13/2017
  Time: 10:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>contractProposal</title>
</head>
<body>

<form id="contractProposalForm"
      name="contractProposalForm"
      method="POST"
      action="javascript:void(0);"
      class="form-horizontal globalForm"
      ng-app="ats.cps"
      ng-controller="contractProposalSetupCntrl"
      ng-class="page.formSubmitted?'submitted' : ''"
      ng-submit="save(contractProposalForm)"
      novalidate="">
    <h1>You are about to propose a contract</h1>
    <fieldset class="v-no-padding">
        <legend>Contract Proposal Details</legend>
        <div class="form-group">
            <div class="col-md-12">
                <div class="form-group">
                    <div class="col-md-5">
                        <div class="form-group">
                            <label class="col-md-5">Agreement Types</label>

                            <div class="col-md-5">
                                <input type="text" class="form-control"
                                       ng-click="changeName()"
                                       ng-model="contractProposalDTO.agreementType"
                                       ng-init="agreementType = 'agreement'">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-5">Department</label>

                            <div class="col-md-5">
                                <input type="text" class="form-control"
                                       ng-model="contractProposalDTO.department">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-5">Select Party</label>

                            <div class="col-md-5">
                                <input type="text" class="form-control"
                                       ng-model="contractProposalDTO.party">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-5">Additional Party</label>

                            <div class="col-md-5">
                                <input type="text" w3-test-directive
                                       class="form-control"
                                       ng-model="contractProposalDTO.adiParty">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-md-5">Dropdown List</label>

                            <div class="col-md-5">
                                <form:select id="dropdownDTOList"
                                        name="dropdownDTOList"
                                        path="dropdownDTOList"
                                        class="form-control"
                                        ng-model="contractProposalDTO.dropdownList"
                                        ng-change="getOnSelectDropDownList()">
                                    <form:option value="" label="please select"></form:option>
                                    <form:options items="${dropdownDTOList}"
                                            itemValue="valueInteger"
                                            itemLabel="text"></form:options>
                                </form:select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-5">On select List</label>

                            <div class="col-md-5">
                                <select id="SelectDropdownList"
                                             name="SelectDropdownList"
                                             class="form-control"
                                             ng-model="contractProposalDTO.SelectDropdownList"
                                        ng-options="item.valueInteger as item.text for item in getDropdownList">
                                    <option value=""> please select</option>

                                </select>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </fieldset>

    <fieldset>
        <legend>Contract List</legend>
        <div class="col-md-12 datagrid">
            <table class="table">
                <thead>
                <tr>
                    <th>Serial No</th>
                    <th>Contract Name</th>
                    <th>Contract Type</th>
                    <th>Contract Body</th>
                    <th>Remarks</th>
                </tr>
                </thead>
                <tbody>
                <tr class="row-selectable" ng-repeat="row in contractList">
                    <td>{{row.serialNo}}</td>
                    <td>{{row.contractName}}</td>
                    <td>{{row.contractType}}</td>
                    <td>{{row.contractBody}}</td>
                    <td>{{row.remarks}}</td>
                </tr>
                </tbody>
            </table>
        </div>
    </fieldset>
    <input type="button" value="fillUp" ng-click="fillOnClick()">
    <input type="button" value="Clear" ng-click="clearOnClick()">
    <input type="button" value="getSomething" ng-click="getSomething()">
    <input type="button" value="getNewLink" ng-click="getNewLink()">
    <input type="submit" value="save" ng-click="save()">

    <div w3-test-directive></div>

    <%--  <script async defer id='2017121942019910'
              src='https://widgets.worldtimeserver.com/Public.ashx?rid=2017121942019910&theme=Analog&action=clock&wtsid=BD&hex=ff9900&city=Dhaka&size=small'></script>

      <script async defer id='201712194292708'
              src='https://widgets.worldtimeserver.com/Public.ashx?rid=201712194292708&theme=Digital&action=clock&wtsid=BD&hex=ff9900&city=Dhaka&size='></script>
  --%>
</form>


<content>
    <jsp:include page="../../layout/include/angularjs.jsp"/>
    <script type="text/javascript" src="<c:url value='/resources/js/lib/ats_factory.js' />"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/ats/cps/page.js' />"></script>
    <script type="text/javascript"
            src="<c:url value='/resources/js/ats/cps/services/contractProposalSetupService.js' />"></script>
    <script type="text/javascript"
            src="<c:url value='/resources/js/ats/cps/controllers/contractProposalSetupCntrl.js' />"></script>

</content>
</body>
</html>
