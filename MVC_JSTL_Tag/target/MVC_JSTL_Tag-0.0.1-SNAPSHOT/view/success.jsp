<%@page import="java.util.List" %>
<%@page import="com.cjc.model.Student" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function add() {
	alert("add data");
	document.myform.action="reg";
	document.myform.submit();
	
}
function edit() {
	alert("edit..");
	document.myform.action="edit";
	document.myform.submit();
	
}
function deletea() {
	alert("delete...");
	document.myform.action="delete";
	document.myform.submit();
	
}


</script>
</head>
<body bgcolor="yellow">
<center>
<form name="myform">
<h1 color="blue"><b>Display  Student Data</b></h1>
<table border="4">
<tr>
<th align='center'>RollNo.</th>
<th align='center'>Name</th>
<th align='center'>Address</th>
<th align='center'>UserName</th>
<th align='center'>Password</th>
<th align='center'>Select</th>
</tr>
<c:forEach items="${list}" var="stud">
<tr>
<td align='center'><c:out value="${stud.rollno}"></c:out></td>
<td align='center'><c:out value="${stud.name}"></c:out></td>
<td align='center'><c:out value="${stud.address}"></c:out></td>
<td align='center'><c:out value="${stud.uname}"></c:out></td>
<td align='center'><c:out value="${stud.password}"></c:out></td>
<td align="center"><input type="radio" name="rollno" value="${stud.rollno}" ></td>
</c:forEach>
</tr>
</table>
<td><input type="submit"  value="ADD" onclick="add()"></td>
<td><input type="submit"  value="Edit" onclick="edit()"></td>
<td><input type="submit"  value="Delete" onclick="deletea()"></td>
</form>
</center>
</body>
</html>