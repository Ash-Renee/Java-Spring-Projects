<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Languages</title>
</head>
<body>


<h1>All Languages</h1>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${allLanguages}" var="lang">
        <tr>
            <td><a href="/show/${lang.id}">${lang.name}</a></td>
            <td><c:out value="${lang.creator}"/></td>
            <td><c:out value="${lang.version}"/></td>
            <td><a href="/edit/${lang.id}">Edit</a>  <a href="/languages/delete/<c:out value="${lang.id}"/>">Delete</a></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<div id="new">
    <form:form action="/languages" method="post" modelAttribute="newLanguage">

    <form:label path="name">Name</form:label>
    <form:input type="text" id="name" path="name"/>
    <form:errors cssClass="red" path="name"/>
    <br>
    <br>
    <form:label path="creator">Creator</form:label>
    <form:input type="text" id="creator" path="creator"/>
    <form:errors cssClass="red" path="creator"/>
    <br>
    <br>
    <form:label path="version">Version</form:label>
    <form:input type="text" id="version" path="version"/>
    <form:errors cssClass="red" path="version"/>
    <br>
    <br>
    <button type="submit">Add New Language</button>
    </form:form>
</div>

</body>
</html>