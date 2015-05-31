<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>
    <title></title>
</head>
<body>
    <p><a href="${pageContext.request.contextPath}/offers">Show current Offers</a> </p>
    <p><a href="${pageContext.request.contextPath}/createOffer">Create Offer</a> </p>

    <h1><c:out value="${id}"/></h1>
</body>
</html>
