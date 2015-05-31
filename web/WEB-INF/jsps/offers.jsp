<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: acanby
  Date: 17/03/2015
  Time: 10:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css" />
    <title></title>
</head>
<body>
    <table class="offers">
        <tr>
            <th>Name</th><th>Email</th><th>Offer</th>
        </tr>
        <c:forEach var="row" items="${offers}">
        <tr>
            <td><c:out value="${row.name}"/></td>
            <td><c:out value="${row.email}"/></td>
            <td><c:out value="${row.offerText}"/></td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
