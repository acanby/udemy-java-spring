<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title></title>
</head>
<body>
    <p><a href="${pageContext.request.contextPath}/offers">Show current Offers</a> </p>
    <p><a href="${pageContext.request.contextPath}/createOffer">Create Offer</a> </p>

    <h1><c:out value="${id}"/></h1>

    <sec:authorize access="hasRole('ROLE_ADMIN')">
    <p><a href="<c:url value="/admin" />">Sneaky Admin Stuff</a></p>
    </sec:authorize>

</body>
</html>
