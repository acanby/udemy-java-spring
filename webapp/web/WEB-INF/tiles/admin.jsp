<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
Don't break anything

<hr>

<table class="formtable">
    <tr>
        <td>Username</td>
        <td>Email</td>
        <td>Role</td>
        <td>Enabled</td>
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
