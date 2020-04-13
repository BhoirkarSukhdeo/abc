<%@page import="com.cjc.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<center>
<form action="edit1">
<h1>Welcome To Edit Page</h1>
<%Student s=(Student)request.getAttribute("std"); %>
<input type="hidden" name="rollno" value="<%=s.getRollno()%>">
<br><br>
Name:-<input type="text" name="name" value="<%=s.getName()%>">
<br><br>
Address:<input type="text" name="address" value="<%=s.getAddress()%>">
<br>
<br>
UserName:<input type="text" name="uname" value=<%=s.getUname() %>>
<br>
<br>
Password:<input type="text" name="password" value=<%=s.getPassword() %>>
<br>
<br>
<input type="submit" value="submit">

</form>
</center>
</body>
</html>