<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<center>
<form action="update">
<h1>Welcome Update Page</h1>
<input type="hidden" name="eid" value="${data.eid}">

 name:<input tyep="text" name="name" value="${data.name}">
<br>
<br>
Address:<input tyep="text" name="address"  value="${data.address}">
<br>
<br>
Company Name:<input tyep="text" name="comName" value="${data.comName}">
<br>
<br>
 Mobile Number:<input tyep="text" name="mobile" value="${data.mobile}">
<br>
<br>
 Salary:<input tyep="text" name="salary" value="${data.salary}">
<br>
<br>
Username:<input tyep="text" name="uname" value="${data.uname}">
<br>
<br>
Password:<input tyep="text" name="password" value="${data.password}">
<br>
<br>
<input type="submit" value="Register">
</form>
</center>
</body>
</html>