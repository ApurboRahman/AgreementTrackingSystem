<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 11/13/2017
  Time: 10:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<script type="text/javascript" src="/resources/js/vendor/angular/core/angular.min.js"></script>
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
    <fieldset>
        <legend>Contract Proposal Details</legend>

        <label>Agreement Types</label>
        <input type="text"
               ng-click="changeName()"
               ng-model="agreementType"
               ng-init="agreementType = 'agreement'"><br>
        <label>Select Department</label>
        <input type="text"
               ng-model="department"><br>
        <label>Select Party</label>
        <input type="text"
               ng-model="party"><br/>
        <label>Select Additional Party</label>
        <input type="text" w3-test-directive
               ng-model="adiParty">
    </fieldset>
    <input type="button" value="fillUp" ng-click="fillOnClick()">
    <input type="button" value="Clear" ng-click="clearOnClick()">

    <div w3-test-directive></div>
</form>


<content>
    <jsp:include page="../../layout/include/angularjs.jsp"/>
    <script type="text/javascript" src="<c:url value='/resources/js/lib/ats_factory.js' />"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/ats/cps/page.js' />"></script>
    <script type="text/javascript"
            src="<c:url value='/resources/js/ats/cps/controllers/contractProposalSetupCntrl.js' />"></script>
    <%-- <script type="text/javascript"
             src="<c:url value='/resources/js/ats/cps/services/contractProposalSetupService.js' />"></script>
    --%>
</content>
</body>
</html>
