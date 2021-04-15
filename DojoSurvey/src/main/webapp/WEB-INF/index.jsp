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

<form action="/process" method=POST>

<label for="name">Your Name</label>
<input type="text" id="name" name="name" />
<br />
<br />
<label for="dojo">Dojo Location</label>
<select name="dojo" id="dojo">
<option value="San Jose">San Jose</option>
<option value="Oakland">Oakland</option>
<option value="Seattle">Seattle</option>
</select>
<br />
<br />
<label for="language">Favorite Language</label>
<select name="language" id="language">
<option value="Python">Python</option>
<option value="Java">Java</option>
<option value="C Sharp">C#</option>
</select>
<br />
<br />
<h3>Comment (optional):</h3>
<textarea name="comment" id="comment" cols="30" rows="10"></textarea>
<br />
<br />
<button>Submit</button>
</form>

</body>
</html>