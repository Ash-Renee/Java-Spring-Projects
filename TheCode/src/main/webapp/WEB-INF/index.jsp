<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>

<title>JAVA SUCKS</title>
<link rel="stylesheet" href="/css/main.css" />
</head>
<body>
<div id="error">
<c:out value="${error}"/>
</div>
<form action="/code" method="POST">

<h2>What is the code?</h2>
<br />
<input type="text" id="code" name="code" />
<br />
<br />
<input type="submit" value="Try Code" />

</form>

</body>
</html>