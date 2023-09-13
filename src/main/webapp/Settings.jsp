<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<a href="CompanyAdd.jsp">My Job</a> <a href="#">My Training</a> <a
			href="#">Resume</a> <a href="#">Preference</a> <a href="#">Shortlisted</a>
		<a href="#">Settings</a> <a href="#">Interview Questions</a>
	</div>
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
						<li class="nav-item"><a class="nav-link" href="#AboutUs">Dashboard</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Logout</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>
	<form action="SettingsController">
		<section class="vh-80" style="height: 200px;">
			<div class="container py-5 h-100" style="margin-top: -20px;">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col-12 col-md-8 col-lg-6 col-xl-5">
						<div class="card shadow-2-strong" style="border-radius: 1rem;">
							<div class="card-body p-5 text-center">
								<h2 class="fw-bold mb-5">Update</h2>
								<div class="form-outline mb-4">
									<input type="text" placeholder="C Number"
										class="form-control" name="cno" />
								</div>
								<div class="form-outline mb-4">
									<input type="password" placeholder="Password"
										class="form-control" name="password" />
								</div>
								<div class="text-center">
									<select class="btn btn-success btn-lg dropdown-toggle"
										id="defaultDropdown" data-bs-toggle="dropdown"
										data-bs-auto-close="true" aria-expanded="false" name="options">
										<option value="cgpa">CGPA</option>
										<option value="mobno">Mobile No.</option>
										<option value="pass">Password</option>
									</select>
								</div><br>
								<div class="form-outline mb-4">
									<input type="password" placeholder="Enter Update"
										class="form-control" name="update" />
								</div>
								<div class="text-center">
									<button type="submit" class="btn btn-primary btn-lg btn-block"
										style="text-align: centre;" value="Login">Update</button>
								</div>
								<br>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	</form>
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
</body>
</html>