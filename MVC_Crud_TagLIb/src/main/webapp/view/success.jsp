<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function add() {
	alert(" are u sure u want add data");
    document.myform.action="register";
	document.myform.submit();
		
}
function edit() {
	alert(" are u sure u want edit data ");

	document.myform.action="edit";
	document.myform.submit();
		
}
function del() {
	alert(" are u sure u want delete data ");

	document.myform.action="del";
	document.myform.submit();
	
	
}
</script>
</head>
<body>
<center>
<table border="1">
<form name="myform">
<h1>Desplay Student Data</h1>
<tr>
<th>Emp Id</th>
<th> Name</th>
<th> Address</th>
<th> Company Name</th>
<th> Username</th>
<th> Password</th>
<th>Mobile number</th>
<th>Salary</th>
<th>select</th>
</tr>
<c:forEach items="${data}" var ="stud">
<tr>
<td><c:out value="${stud.eid}"></c:out></td>
<td><c:out value="${stud.name}"></c:out></td>
<td><c:out value="${stud.address}"></c:out></td>
<td><c:out value="${stud.comName}"></c:out></td>
<td><c:out value="${stud.uname}"></c:out></td>
<td><c:out value="${stud.password}"></c:out></td>
<td><c:out value="${stud.mobile}"></c:out></td>
<td><c:out value="${stud.salary}"></c:out></td>
<td><input type="radio" name="eid" value="${stud.eid}"></td>
</tr>
</c:forEach>

</form>
</table>
<input type="submit" value="add" onclick="add()">
<input type="submit" value="edit" onclick="edit()">
<input type="submit" value="delete" onclick="del()">
</center>
</body>
</html>