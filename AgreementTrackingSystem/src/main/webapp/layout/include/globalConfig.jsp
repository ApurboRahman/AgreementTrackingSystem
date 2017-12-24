<%--
  Created by IntelliJ IDEA.
  User: md.rahman
  Date: 11/18/2017
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
  globalConfig = {
    dateFormat: '${pageContext.session.getAttribute("globalPolicy").getDateFormatForJs()}',
    financialValueFormat: '${pageContext.session.getAttribute("globalPolicy").getAmountFormatForJs()}',
    decimalPlacesForAmount: '${pageContext.session.getAttribute("globalPolicy").getDecimalPlacesForJs()}'
  };
  currentUser = {
    branchCode: '${pageContext.session.getAttribute("currentUser").getBranchCode()}',
    branchName: '${pageContext.session.getAttribute("currentUser").getBranchName()}',
    userId: '${pageContext.session.getAttribute("currentUser").getUserId()}',
    userName: '${pageContext.session.getAttribute("currentUser").getUserName()}',
    systemOpenDate:${pageContext.session.getAttribute("currentUser").getSystemOpenDate().getTime()},
    ServerDate:${pageContext.session.getAttribute("currentUser").getServerDateDate().getTime()}
  };
  environment = {
    env:${pageContext.session.getAttribute("env")},
    env:${pageContext.response.locale}
  };
</script>
