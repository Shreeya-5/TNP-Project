<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="tnp.model.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="index.html"%>
<link rel="stylesheet" href="sidebar.css">
</head>
<body>
	<div id="mySidebar" class="sidebar">
		<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
		<a href="CompanyAdd.jsp">Add Company</a> 
		<a href="#">Add Training</a> 
		<a href="DisplayStudReg">Student Record</a> 
		<a href="DisplayCompanyController">Display Jobs</a> 
		<a href="#">Display Training</a> 
		<a href="#">Interview Questions</a>
	</div>
	<div class="container-fluid">
		<nav class="navbar navbar-expand-lg"
			style="margin-top: -9px; margin-left: -12px; margin-right: -12px;">
			<div class="container-fluid"
				style="background-color: #12276a; color: white; height: 60px;">
				<div id="main">
					<button class="openbtn" onclick="openNav()">&#9776;</button>
				</div>
				<a href="#" class="navbar-brand"> <img alt="cumminslogo"
				style="height: 45px; width: 45px; border-radius: 25px;"
					src="CumminsLogo.png">
				</a> <a><h5>Home</h5></a>
				<button class="navbar-toggler" type="button" style="color: white;"
					data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
					<span class="navbar-toggler-icon" style="color: white;"></span>
				</button>
				<div class="collapse navbar-collapse justify-content-end"
					id="collapsibleNavbar">
					<ul class="navbar-nav">

						<li class="nav-item"><div class="nav-item dropdown">
								<a class="nav-link dropdown-toggle" role="button"
									data-bs-toggle="dropdown" style="color: white;">Login</a>
								<ul class="dropdown-menu">
									<li><a class="dropdown-item" href="Login.jsp">Student</a></li>
									<li><a class="dropdown-item" href="AdminLogin.jsp">Admin</a></li>
								</ul>
							</div>
						<li class="nav-item"><a class="nav-link" href="#AboutUs">About
								us</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Register</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>
	<script>
		function openNav() {
			document.getElementById("mySidebar").style.width = "250px";
			document.getElementById("main").style.marginLeft = "250px";
		}

		function closeNav() {
			document.getElementById("mySidebar").style.width = "0";
			document.getElementById("main").style.marginLeft = "0";
		}
	</script>
<form action="DisplayScheduleScontroller">
<%!List<Schedule> schedlst=null;%>
<%
schedlst=(List<Schedule>)session.getAttribute("schelst");
if(schedlst!=null){
%>
<h1 class="my-5 mx-5 dis" >Schedule List</h1>
<table  class="table table-striped">
<thead>
<tr>
<th>Company Name</th>
<th>comingDate</th>
<th>Time</th>
<th>Mode</th>
<th>Event</th>
<th>Branch</th>
<th>CGPA</th>
<th>Stiphend</th>
<th>Location</th>
</tr>
</thead>
<%
	for(Schedule s:schedlst){
%>
<tbody>
	<tr>
	<td><%=s.getCmpname() %></td>
	<td><%=s.getComingdate() %></td>
	<td><%=s.getTime() %></td>
	<td><%=s.getModeofprocess() %></td>
	<td><%=s.getEvent() %></td>
	<td><%=s.getBranch() %></td>
	<td><%=s.getCgpa() %></td>
	<td><%=s.getStiphend() %></td>
	<td><%=s.getLocation() %>
	</tr>
</tbody>	
<%}%>
</table>	
<%}%>
</form>
</body>
</html>