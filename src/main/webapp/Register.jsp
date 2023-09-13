<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta charset="ISO-8859-1">
<title>Register</title>
<%@ include file="index.html"%>
<link rel="stylesheet" href="styles.css">
</head>
<style>
.card {
	margin: 0 auto; /* Added */
	float: none; /* Added */
	margin-bottom: 10px; /* Added */
}
</style>
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
	
	<form action="StudentController">
		<div class="card shadow-5-strong"
			style="margin-top: 100px; margin-bottom: 100px; width: 800px; background: hsla(0, 0%, 100%, 0.8); backdrop-filter: blur(30px);">
			<div class=" my-2">
				<div class="row d-flex justify-content-center"
					style="border: 2px; border-color: gray;">
					<div class="col-lg-8">
						<h2 class="fw-bold mb-5" style="margin-top: 20px;">Register</h2>
						<div class="form-outline mb-4">
							<input type="text" placeholder="Enter Full Name"
								class="form-control" name="sname" />
						</div>
						<div class="form-outline mb-4">
							<input type="text" placeholder="Enter C Number"
								class="form-control" name="cno" />
						</div>
						<div class="form-outline mb-4">
							<input type="email" placeholder="Enter Email Address"
								class="form-control" name="semail" />
						</div>
						<div class="form-outline mb-4">
							<input type="text" placeholder="Enter Mobile Number"
								class="form-control" name="mobno" />
						</div>
						<div class="form-outline mb-4">
							<input type="text" placeholder="Postal Address"
								class="form-control" name="saddress" />
						</div>
						<div class="form-outline mb-4">
							<input type="text" placeholder="Graduation Year"
								class="form-control" name="graduyear" />
						</div>
						<div class="form-outline mb-4">
							<input type="text" placeholder="Branch" class="form-control"
								name="branch" />
						</div>
						<div class="form-outline mb-4">
							<input type="text" placeholder="CGPA" class="form-control"
								name="cgpa" />
						</div>

						<div class="form-outline mb-4">
							<input type="password" placeholder="Password"
								class="form-control" name="password" />
						</div>
						<div class="form-outline mb-4">
							<input type="password" placeholder="Confirm Password"
								class="form-control" name="pass" />
						</div>
						<div class="text-center">
							<button type="submit" class="btn btn-primary btn-lg btn-block"
								style="text-align: centre;" value="Register">Register</button>
						</div>
						<br>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>