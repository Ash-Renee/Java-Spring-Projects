<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><c:out value="${language.name}"/></title>
</head>
<body>

		<form:form action="/languages/update" method="post" modelAttribute="changedLanguage">
		    <input type="hidden" name="_method" value="put">
			        <form:input type="hidden" cssClass="box" path="id"/>

			    <p>
			        <form:label cssClass="label" path="name">Name</form:label>
			        <form:input cssClass="box" path="name"/>
			        <form:errors cssClass="red" path="name"/>

			    </p>
			    <p>
			        <form:label cssClass="label" path="creator">Creator</form:label>
			        <form:input cssClass="box" path="creator"/>
    				<form:errors cssClass="red" path="creator"/>
			    </p>
			    <p>
			        <form:label cssClass="label" path="Version">Version</form:label>
			        <form:input cssClass="box" path="Version"/>
     		 		<form:errors cssClass="red" path="Version"/>
			    </p>
		    <input id="button" type="submit" value="Submit"/>
		</form:form>

</body>
</html>