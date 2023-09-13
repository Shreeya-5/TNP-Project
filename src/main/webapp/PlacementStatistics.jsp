<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="index.html"%>
<link rel="stylesheet" href="PlacementStatisic.css">
</head>
<body>
	<div class="container-fluid">
		<nav class="navbar navbar-expand-lg"
			style="margin-top: -9px; margin-left: -12px; margin-right: -12px;">
			<div class="container-fluid"
				style="background-color: #12276a; color: white; height: 60px;">

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
						<li class="nav-item"><a class="nav-link"
							href="StudentHome.jsp">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="Dashboard.jsp">Logout</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>
	<div class="h-100 d-flex align-items-center justify-content-center"
		style="padding: 10px; height: 100px;">
		<div>
			<h2>Placements</h2>
		</div>
	</div>
	<div class="row" style="margin-right: 20px;">
		<div class="col justify-content-center">
			<img alt="StudentsPlaced" src="Placement-students-placed.jpg"
				style="height: 400px; width: 500px; margin-left: 100px; margin-right: 50px; margin-top: 25px; margin-bottom: 25px;"></img>
		</div>
		<div class="col justify-content-center">
			<img alt="CompanyVisited" src="Placement-company-visited.jpg"
				style="height: 400px; width: 500px; margin-left: 70px; margin-right: 50px; margin-top: 25px; margin-bottom: 25px;"></img>
		</div>
	</div>
	<div class="row" style="margin-right: 20px;">
		<div class="col justify-content-center">
			<img alt="StudentsPlaced" src="Placement-Max-package.jpg"
				style="height: 400px; width: 500px; margin-left: 100px; margin-right: 50px; margin-top: 25px; margin-bottom: 25px;"></img>
		</div>
		<div class="col justify-content-center">
			<img alt="CompanyVisited" src="Placements-Ave.package.jpg"
				style="height: 400px; width: 500px; margin-left: 70px; margin-right: 50px; margin-top: 25px; margin-bottom: 25px;"></img>
		</div>
	</div>
</body>
</html>