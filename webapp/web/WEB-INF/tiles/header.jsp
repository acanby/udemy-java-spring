<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<a class="title" href="<c:url value="" />">Offers</a></p>

<sec:authorize access="!isAuthenticated()">
  <a class="login" href="<c:url value="/login" />">Login</a></p>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
  <p><a class="login" href="<c:url value="/j_spring_security_logout" />">Logout</a></p>
</sec:authorize>

