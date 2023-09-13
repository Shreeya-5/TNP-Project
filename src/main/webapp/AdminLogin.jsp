<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta charset="ISO-8859-1">
<title>Login</title>
<%@ include file="index.html"%>
<link rel="stylesheet" href="styles.css">
</head>
<body>
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
				</a> <a><h5>Cummins Placement Cell</h5></a>
				<button class="navbar-toggler" type="button" style="color: white;"
					data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
					<span class="navbar-toggler-icon" style="color: white;"></span>
				</button>
				<div class="collapse navbar-collapse justify-content-end"
					id="collapsibleNavbar">
					<ul class="navbar-nav">
						<li class="nav-item"><a class="nav-link" href="Dashboard.jsp">Home</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>
	<form action="AdminLoginController">
		<section class="vh-100">
			<div class="container py-5 h-100">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col-12 col-md-8 col-lg-6 col-xl-5">
						<div class="card shadow-2-strong"
							style="border-radius: 1rem;">
							<div class="card-body p-5 text-center">
								<h2 class="fw-bold mb-5">Admin Login</h2>
								<div class="form-outline mb-4">
									<input type="text" placeholder="Enter Username"
										class="form-control" name="uname" />
								</div>
								<div class="form-outline mb-4">
									<input type="password" placeholder="Password"
										class="form-control" name="pass" />
								</div>
								<div class="text-center">
									<button type="submit" class="btn btn-primary btn-lg btn-block"
										style="text-align: centre;" value="Login">Login</button>
								</div>
								<br>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	</form>
</body>
</html>