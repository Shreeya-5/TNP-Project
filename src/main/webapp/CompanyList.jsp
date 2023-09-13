<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
     <%@page import="tnp.model.*" %> 
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<link rel="stylesheet" href="styles.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Display Company</h1>
<form action="DisplayCompanyController">
<%!List<Company> lst=null;%>
<%
lst=(List<Company>)session.getAttribute("cmplst");
if(lst!=null){
%>
<h1 class="my-5 mx-5 dis" >Company List</h1>

<table class="table table-striped">
<thead>
<tr>
<th>Company Name</th>
<th>Website</th>
<th>Address</th>
<th>Mode</th>
<th>Online Test Time</th>
<th>Interview Time</th>
<th>Nature of Job</th>
<th>Location</th>
<th>Branch</th>
<th>Internship Duration</th>
<th>Eligibility</th>
<th>Stiphend</th>
<th>Selection Process:</th>
</tr>
</thead>
<%
	for(Company c:lst){
%>
<tbody>
	<tr>
	<td><%=c.getCmpname() %></td>
	<td><%=c.getWebsite() %></td>
	<td><%=c.getCmpadd() %></td>
	<td><%=c.getMode() %></td>
	<td><%=c.getOnlitesttimedate() %></td>
	<td><%=c.getInterviewtimedate() %></td>
	<td><%=c.getNatureofjob() %></td>
	<td><%=c.getLocation() %></td>
	<td><%=c.getBranches() %></td>
	<td><%=c.getInternshipdur() %></td>
	<td><%=c.getEligibility() %></td>
	<td><%=c.getStiphend() %></td>
	<td><%=c.getSelectionproc() %></td>
	</tr>
	</tbody>
<%}%>
</table>	
<%}%>
</form>
</body>
</html>