<%@page import="com.cjc.model.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<body bgcolor="gold" font-color="blue">
 <form action="update">
<%Student st=(Student)request.getAttribute("list");%>
<table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>

<center><tr>
   <td><h1>Update Form For Student</h1></td>
</tr><center>
 
<table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>

<tr>
    <td align='center'></td>
    <td><input type='hidden' name='rollno' value="<%=st.getRollno()%>"></td>
</tr>
<tr>
    <td align='center'>Name:</td>
    <td><input type='text' name='name' value="<%=st.getName()%>"></td>
</tr>

<tr> <td>&nbsp;</td> </tr>

<tr>
    <td align='center'>Address:</td>
    <td><input type='text' name='address' value="<%=st.getAddress()%>"></td>
</tr>

<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>User Name:</td>
    <td><input type='text' name='uname' value="<%=st.getUname()%>"></td>
</tr>

<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>Password:</td>
    <td><input type='text' name='password' value="<%=st.getPassword()%>"></td>
</tr>

<tr> <td>&nbsp;</td> </tr>

<table border='0' cellpadding='0' cellspacing='0' width='480px' align='center'>
<tr>
    <td align='center'><input type='submit' name='REGISTER' value="Update"></td>
</tr>
</table>

</table>
</table>
</form>
</body>
</html>