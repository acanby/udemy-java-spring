<%--
  Created by IntelliJ IDEA.
  User: acanby
  Date: 4/08/2015
  Time: 9:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
    <title><tiles:insertAttribute name="title"/></title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css" />
</head>
<body>
  <div class="header"><tiles:insertAttribute name="header" /></div>
  <div class="content"><tiles:insertAttribute name="content" /></div>
  <div class="footer"><tiles:insertAttribute name="footer" /></div>
</body>
</html>
