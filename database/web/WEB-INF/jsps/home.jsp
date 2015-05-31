<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>
    <title></title>
</head>
<body>
    <sql:query var="rs" dataSource="jdbc/postgres">
        select id, email, name, offer_text from offer
    </sql:query>

<c:forEach var="row" items="${rs.rows}">
    <p>Offer: ${row.id}, ${row.name}, ${row.email}, ${row.offer_text}</p>
</c:forEach>
</body>
</html>
