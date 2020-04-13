<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.cjc.model.Employee" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<center>
<form action="update">
<h1>Welcome To Register Page</h1>
<%Employee emp=(Employee)request.getAttribute("data");%>

Emp Id-<input type="text" name="eid" value="<%=emp.getEid()%>">
<br>
<br>
Name:-<input type="text" name="name" value="<%=emp.getName()%>">
<br>
<br>
Address:-<input type="text" name="address" value="<%=emp.getAddress()%>">
<br>
<br>
Company name:-<input type="text" name="comName" value="<%=emp.getComName()%>">
<br>
<br>
Username:-<input type="text" name="login.uname" value="<%=emp.getLogin().getUname()%>">
<br>
<br>
Password:-<input type="text" name="login.password" value="<%=emp.getLogin().getPassword()%>">
<br>
<br>
<input type="submit" value="Update">
</form>
</center>
</body>
</html>