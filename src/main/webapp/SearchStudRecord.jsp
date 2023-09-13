<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="tnp.model.*" %>
      <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<link rel="stylesheet" href="styles.css">
</head>
<body>
<form action="StudentSearchController">
<table>
<tr>
	
	<td><input type="text" placeholder="Enter C no" required="required" name="cno"></td>
</tr>

<tr>
<td><input type="submit" value="Search"></td>
</tr>
</table>


<%!StudRegister r=null; %>
<%
if(!session.isNew()){
	r=(StudRegister)session.getAttribute("search");
	session.invalidate();
%>
<table border="2px" align="center">
<tr><th>Student Name</th><th>C No</th><th>Email</th><th>Mobile No</th><th>Address</th><th>Graduation Year</th><th>Branch</th><th>CGPA</th><th>Password</th></tr>

	<tr>
	<td><%=r.getSname()%></td>
	<td><%=r.getCno() %></td>
	<td><%=r.getSemail() %></td>
	<td><%=r.getMobno() %></td>
	<td><%=r.getSaddress() %></td>
	<td><%=r.getGraduyear() %></td>
	<td><%=r.getBranch() %></td>
	<td><%=r.getCgpa() %></td>
	<td><%=r.getPassword() %></td>
	</tr>

	</table>
<%} %>
</form>
</body>
</html>