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
<form method="post" action="${pageContext.request.contextPath}/doCreate">
    <table class="formtable">
        <tr>
            <td class="label">Name:</td><td><input name="name" type="text"></td>
        </tr>
        <tr>
            <td class="label">Email:</td><td><input name="email" type="text"></td>
        </tr>
        <tr>
            <td class="label">Your offer:</td><td><textarea name="offerText" type="text" ></textarea></td>
        </tr>
        <tr>
            <td>&nbsp;</td><td><input name="Create" type="submit"></td>
        </tr>
    </table>
</form>
</body>
</html>
