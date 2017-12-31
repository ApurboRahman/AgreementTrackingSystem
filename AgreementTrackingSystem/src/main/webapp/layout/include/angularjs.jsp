<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>

    <c:when test="${env=='\"PROD\"'}">
        <%--  <script type="text/javascript" src="<c:url value="/resources/dist/js/ats.angular.min.js"/>"></script>--%>
    </c:when>
    <c:otherwise>
        <script type="text/javascript" src="<c:url value="/resources/js/vendor/angular/core/angular.min.js"/>"></script>
        <script type="text/javascript"
                src="<c:url value="/resources/js/vendor/angular/bootstrap/ui-bootstrap-tpls-0.13.2.min.js"/>"></script>
        <script type="text/javascript"
                src="<c:url value="/resources/js/vendor/angular/core/angular-sanitize.min.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/vendor/angular/loading-bar.min.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/vendor/jquery-3.2.1.min.js"/>"></script>
        <script type="text/javascript"
                src="<c:url value="/resources/js/vendor/validate/jquery.validate.min.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/vendor/alertify.min.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/vendor/angular/loading-bar.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/lib/ats_lib.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/lib/ats_services.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/lib/ats_directives.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/lib/ats_filters.js"/>"></script>
    </c:otherwise>
</c:choose>
