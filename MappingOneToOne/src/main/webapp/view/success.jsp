<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List"%>
    <%@ page import="com.cjc.model.Employee" %>
    <%@ page import="com.cjc.model.Login" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function add() {
	alert("add data");
	document.myform.action="register";
	document.myform.submit();
	
}
function edit() {
	alert("edit data");
	document.myform.action="edit";
	document.myform.submit();
	
}
function del() {
	alert("delete data");
	document.myform.action="delete";
	document.myform.submit();
	
}

</script>

</head>
<body>
<center>

<form name="myform">
<h1>Display All Data</h1>
<%List<Employee> list=(List<Employee>)request.getAttribute("data");%>
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Address</th>
<th>com Name</th>
<th>Username</th>
<th>Password</th>
<th>select</th>
</tr>
<%for(Employee e:list) {%>
   <tr>
   <td><%=e.getEid()%></td>
   <td><%=e.getName()%></td>
   <td><%=e.getAddress()%></td>
   <td><%=e.getComName()%></td>
   <td><%=e.getLogin().getUname()%></td>
   <td><%=e.getLogin().getPassword()%></td>
   <td><input type="radio" name="eid" value="<%=e.getEid()%>"></td>
   </tr>
<% } %>
</table>
<input type="submit"  value="Add" onclick="add()">
<input type="submit"  value="Edit" onclick="edit()">
<input type="submit"  value="Delete" onclick="del()">
</form>
</center>
</body>
</html>