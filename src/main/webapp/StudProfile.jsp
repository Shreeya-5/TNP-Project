<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="tnp.model.*" %>
    <%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!List<StudRegister> studlst=null; %>
<%!StudRegister s=null; %>
<%
studlst=(List<StudRegister>)session.getAttribute("stdlist");
s = studlst.get(0);
if(studlst!=null){
%>
<table border="2px" align="center">
<tr><th>Student Name</th><th>C No</th><th>Email</th><th>Mobile No</th><th>Address</th><th>Graduation Year</th><th>Branch</th><th>CGPA</th><th>Password</th></tr>

	<tr>
	<td><%=s.getSname() %></td>
	<td><%=s.getCno() %></td>
	<td><%=s.getSemail() %></td>
	<td><%=s.getMobno() %></td>
	<td><%=s.getSaddress() %></td>
	<td><%=s.getGraduyear() %></td>
	<td><%=s.getBranch() %></td>
	<td><%=s.getCgpa() %></td>
	<td><%=s.getPassword() %></td>
	</tr>
</table>	
<%}%>

</body>
</html>