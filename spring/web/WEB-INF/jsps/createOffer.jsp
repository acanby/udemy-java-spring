<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<form:form method="post" action="${pageContext.request.contextPath}/doCreate" commandName="offer">
    <table class="formtable">
        <tr>
            <td class="label">Name:</td><td><form:input name="name" type="text" path="name" /><br/><form:errors path="name" cssClass="error"/></td>
        </tr>
        <tr>
            <td class="label">Email:</td><td><form:input name="email" type="text" path="email" /><br/><form:errors path="email" cssClass="error"/></td>
        </tr>
        <tr>
            <td class="label">Your offer:</td><td><form:textarea name="offerText" type="text" path="offerText" /><br/><form:errors path="offerText" cssClass="error"/></td>
        </tr>
        <tr>
            <td>&nbsp;</td><td><input name="Create" type="submit" /></td>
        </tr>
    </table>
</form:form>
</body>
</html>
