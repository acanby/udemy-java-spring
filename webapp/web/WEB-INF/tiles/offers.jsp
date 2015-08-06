<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table class="offers">
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Offer</th>
    </tr>
    <c:forEach var="row" items="${offers}">
        <tr>
            <td><c:out value="${row.name}"/></td>
            <td><c:out value="${row.email}"/></td>
            <td><c:out value="${row.offerText}"/></td>
        </tr>
    </c:forEach>
</table>