<%--
  Created by IntelliJ IDEA.
  User: md.rahman
  Date: 11/18/2017
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.ResourceBundle" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--<%
    ResourceBundle resource = ResourceBundle.getBundle("env");
    String environment = resource.getString("ENVIRONMENT");
    pageContext.setAttribute("env", environment);
    pageContext.getSession().setAttribute("env", environment);
%>--%>
<html>

<head>
    <title>
        <sitemesh:write property="title"/>
    </title>
    <jsp:include page="include/globalConfig.jsp"/>
    <%--    <c:choose>
            <c:when test="${env=='\"PROD\"'}">
                <link rel="shortcut icon" href="<c:url value='/resources/dist/images/favicon/favicon.ico'/>"/>
                &lt;%&ndash; <link rel="stylesheet" href="<c:url value='/resources/dist/css/ats.min.css'/>"/>
                 <script type="text/javascript" src="<c:url value='/resources/dist/js/ats.min.js'/>"></script>&ndash;%&gt;
            </c:when>
            <c:otherwise>
                <link rel="shortcut icon" href="<c:url value='/resources/dist/images/favicon/favicon.ico'/>"/>
                <jsp:include page="include/css.jsp"/>
                <jsp:include page="include/js.jsp"/>
            </c:otherwise>
        </c:choose>--%>
    <jsp:include page="include/css.jsp"/>
    <%--  <jsp:include page="include/js.jsp"/>--%>
</head>
<body>
<%--Load Header File--%>
<jsp:include page="include/header.jsp"/>
<div class="container" id="resizeContainer">
    <%--Load Menu File--%>
    <jsp:include page="include/menu.jsp"/>
    <div class="col-md-10" id="resizeBody">
        <sitemesh:write property="body"/>

    </div>

</div>
<%--Load Footer File--%>
<jsp:include page="include/footer.jsp"/>
</body>
</html>
