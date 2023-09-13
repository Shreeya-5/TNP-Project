<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Jobs</title>
<%@ include file="index.html"%>
<link rel="stylesheet" href="styles.css">
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
		<div class="col-4">
			<div class="container text-center"
				style="padding: 20px; height: 100px; background-color: #ffdead; margin: 20px;">
				<a style="color: black; text-decoration: none; font-size: 20px;"
					href="https://www.cumminscollege.org/wp-content/uploads/2021/12/TP-Data.pdf">Placement
					Statistics Year 2020-21</a>
			</div>
		</div>
		<div class="col-4">
			<div class="container text-center"
				style="padding: 20px; height: 100px; background-color: #ffdead; margin: 20px;">
				<a style="color: black; text-decoration: none; font-size: 20px;"
					href="https://www.cumminscollege.org/wp-content/uploads/2020/12/Placements2020new.pdf">Placement
					Statistics Year 2019-20</a>
			</div>
		</div>
		<div class="col-4">
			<div class="container text-center"
				style="padding: 20px; height: 100px; background-color: #ffdead; margin: 20px;">
				<a style="color: black; text-decoration: none; font-size: 20px;"
					href="https://www.cumminscollege.org/wp-content/uploads/2019/06/Placed2019.pdf">Placement
					Statistics Year 2018-19</a>
			</div>
		</div>
	</div>
	<div class="row" style="margin-right: 20px;">
		<div class="col-4">
			<div class="container text-center"
				style="padding: 20px; height: 100px; background-color: #ffdead; margin: 20px;">
				<a style="color: black; text-decoration: none; font-size: 20px;"
					href="https://cumminscollege.org/wp-content/uploads/2019/03/Placementdata17-187-6-18-1.pdf">Placement
					Statistics Year 2017-18</a>
			</div>
		</div>
		<div class="col-4">
			<div class="container text-center"
				style="padding: 20px; height: 100px; background-color: #ffdead; margin: 20px;">
				<a style="color: black; text-decoration: none; font-size: 20px;"
					href="https://cumminscollege.org/wp-content/uploads/2019/03/placed2016-17data.pdf">Placement
					Statistics Year 2016-17</a>
			</div>
		</div>
		<div class="col-4">
			<div class="container text-center"
				style="padding: 20px; height: 100px; background-color: #ffdead; margin: 20px;">
				<a style="color: black; text-decoration: none; font-size: 20px;"
					href="https://cumminscollege.org/wp-content/uploads/2019/03/tPO15-16.pdf">Placement
					Statistics Year 2015-16</a>
			</div>
		</div>
	</div>
</body>
</html>