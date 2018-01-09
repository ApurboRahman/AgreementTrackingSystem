<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Apurbo
  Date: 11/11/2017
  Time: 9:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ats</title>
</head>
<body>
<h1>Welcome to ATS</h1>


<form class="form-group" action="/getSomething">

    <input type="submit" name="submit" value="submit"/>

</form>

<a href=" <c:url value="/contractProposal"/>">Department Setup</a>
<a href=" <c:url value="/contractProposal"/>">Department Setup</a>
</body>
</html>
