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
	<h1><c:out value="${language.name}"/></h1>
	<p>Created By: <c:out value="${language.creator}"/></p>
	<p>Version: <c:out value="${language.version}"/></p>
	
	<a href="/edit/${language.id}">Edit language</a>
	<br />
	<br />
	<form action="/languages/delete/${language.id}" method="post">
	    <input type="hidden" name="_method" value="delete">
	    <input type="submit" value="Delete">
	</form>
	<br />
	<a href="/">Home</a>
	
</body>
</html>