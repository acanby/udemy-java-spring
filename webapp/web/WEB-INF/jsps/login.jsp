<%--
  Created by IntelliJ IDEA.
  User: acanby
  Date: 1/06/2015
  Time: 10:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Login Page</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css" />
</head>
<body onload="document.f.j_username.focus();">
  <h3>Login with Username and Password</h3>

  <c:if test="${param.error != null}">
  <p class="error">
    Login failed - check username and password
  </p>
  </c:if>

  <form name="formtable" action="${pageContext.request.contextPath}/j_spring_security_check" method="POST">
    <table>
      <tbody>
      <tr>
        <td>User:</td><td><input type="text" name="j_username" value=""></td>
      </tr>
      <tr>
        <td>Password:</td><td><input type="password" name="j_password"></td>
      </tr>
      <tr>
        <td>Remember Me:</td><td><input type="checkbox" name="_spring_security_remember_me" checked="checked"></td>
      </tr>
      <tr>
        <td colspan="2"><input name="submit" type="submit" value="Login"></td>
      </tr>
      </tbody>
    </table>
  </form>

  <p><a href='<c:url value="/newAccount"/>'>Create new account</a></p>
</body>
</html> 