<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
    
    
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
<h1>You have visited here <c:out value="${visits}"/> times.  Look at you go you little lab rat you!!</h1>
<br />
<br />
<a href="/">Click here to go back to the last page (why you wanna do this, I have no clue, but you do you boo)</a>
<br />
<br />
<br />
<a href="/reset">Reset me because you have no life</a>
</body>
</html>