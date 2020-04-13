<%@page import="com.cjc.model.Student" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<%response.setHeader("cache-controll","no-chache,no-store,must-validate"); %>

<center>
<h1>Display All Data</h1>
<%List<Student> stud=(List<Student>)request.getAttribute("lists");%>
<table border="1">
<tr>
<th>RollNo</th>
<th>Name</th>
<th>Address</th>
<th>UserName</th>
<th>Password</th>
<th>Operation1</th>
<th>Opration2</th>
</tr>

<% for(Student s:stud){ %>
<tr>
<td><%=s.getRollno() %></td>
<td><%=s.getName()%></td>
<td><%=s.getAddress() %></td>
<td><%=s.getUname() %></td>
<td><%=s.getPassword() %></td>
<td><a href="edit?id=<%=s.getRollno()%>">edit</a></td>
<td><a href="delete?id=<%=s.getRollno()%>">delete</a></td>
</tr>
<%} %>
<td><a href="logout">Logout</a></td>
</table>
</center>
</body>
</html>