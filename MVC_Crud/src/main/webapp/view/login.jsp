<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<%response.setHeader("cache-controll","no-chache,no-store,must-validate"); %>
<center>
<form action="log">
<h1>Welcome To Login Page</h1>
User Name:<input type="text" name="uname">
<br>
<br>
Password:<input type="password" name="password">
<br>
<br>
<input type="submit" value="Login">
</form>

</center>
</body>
</html>