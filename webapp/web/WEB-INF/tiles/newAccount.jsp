<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form method="post" action="${pageContext.request.contextPath}/createAccount" commandName="user">
    <table class="formtable">
        <tr>
            <td class="label">Username:</td><td><form:input name="username" type="text" path="username" /><br/><form:errors path="username" cssClass="error"/></td>
        </tr>
        <tr>
            <td class="label">Email:</td><td><form:input name="email" type="text" path="email" /><br/><form:errors path="email" cssClass="error"/></td>
        </tr>
        <tr>
            <td class="label">Password:</td><td><form:input name="password" type="text" path="password" /><br/><form:errors path="password" cssClass="error"/></td>
        </tr>
        <tr>
            <td class="label">Confirm Password:</td><td><input name="passwordConfirm" type="password" /><br/><form:errors path="password" cssClass="error"/></td>
        </tr>
        <tr>
            <td>&nbsp;</td><td><input name="Create" type="submit" /></td>
        </tr>
    </table>
</form:form>