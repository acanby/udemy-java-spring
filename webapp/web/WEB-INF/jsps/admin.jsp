<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: acanby
  Date: 27/07/2015
  Time: 7:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css" />
</head>
<body>
  Don't break anything

  <hr>

  <table class="formtable">
    <tr>
      <td>Username</td><td>Email</td><td>Role</td><td>Enabled</td>
    </tr>
    <c:forEach items="${users}" var="user">
    <tr>
      <td><c:out value="${user.username}"/></td>
      <td><c:out value="${user.email}"/></td>
      <td><c:out value="${user.authority}"/></td>
      <td><c:out value="${user.enabled}"/></td>
    </tr>
    </c:forEach>
  </table>
</body>
</html>
