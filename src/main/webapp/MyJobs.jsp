<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta charset="ISO-8859-1">
<title>Login</title>
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

	<div class="p-5 bg-image" style="height: 250px;"></div>
	<div class="container-md mx-auto mp-auto mt-5 op">
		<form action="LoginController">
			<div class="mx-5" style="align-content: center;">
				<div class="card mx-5 md-5 shadow-5-strong justify-content-center"
					style="margin-top: -200px; margin-bottom: 100px;">
					<div class="card-body my-2">
						<div class=" my-2">
							<div class="row d-flex justify-content-center"
								style="border: 2px; border-color: gray;">
								<div class="col-lg-5">
									<h2 class="fw-bold mb-5">Search here</h2>
									<div class="form-outline mb-4">
										<input type="text" placeholder="Enter C Number"
											class="form-control" name="cno" />
									</div>

									<div class="text-center">
										<button type="submit" class="btn btn-primary btn-lg btn-block"
											style="text-align: centre;" value="Search">Search</button>
									</div>
									<br>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
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
</body>
</html>