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
<style>
	h1{
	text-decoration: underline;	
	}</style>
<body>
<h1>Submitted Info:</h1>
<br />
<br />
Name: <c:out value="${name}"/>
<br />
<br />
Dojo Location: <c:out value="${dojo}"/>
<br />
<br />
Favorite Language: <c:out value="${language}"/>
<br />
<br />
Comment: <c:out value="${comment}"/>
<br />
<br />



</body>
</html>