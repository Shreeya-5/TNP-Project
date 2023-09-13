<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Schedule Form</title>
<%@ include file="index.html"%>
<link rel="stylesheet" href="sidebar.css">
</head>
<body>
	<div id="mySidebar" class="sidebar">
		<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
		<a href="CompanyAdd.jsp">Add Company</a> <a href="#">Add Training</a>
		<a href="DisplayStudReg">Student Record</a> <a
			href="DisplayCompanyController">Display Jobs</a> <a href="#">Display
			Training</a> <a href="#">Interview Questions</a>
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
				</a> <a><h5>Cummins Placement Cell</h5></a>
				<button class="navbar-toggler" type="button" style="color: white;"
					data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
					<span class="navbar-toggler-icon" style="color: white;"></span>
				</button>
				<div class="collapse navbar-collapse justify-content-end"
					id="collapsibleNavbar">
					<ul class="navbar-nav">
						<li class="nav-item"><a class="nav-link" href="Dashboard.jsp">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="StudentHome.jsp">Logout</a></li>
						<li class="nav-item"><a class="nav-link" href="StudProfile.jsp">
						<i class="bi bi-person-circle"
							style="font-size: 1.5rem; color: white;"></i></a></li>
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
	<form action="ScheduleController">
		<div class="p-5 bg-image" style="height: 250px;"></div>
		<div class="container-md mx-auto mp-auto mt-5 op">

			<div class="mx-5" style="align-content: center;">
				<div class="card mx-5 md-5 shadow-5-strong justify-content-center"
					style="margin-top: -200px; margin-bottom: 100px;">
					<div class="card-body my-2">
						<div class=" my-2">
							<div class="row d-flex justify-content-center"
								style="border: 2px; border-color: gray;">
								<div class="col-lg-5">
									<h2 class="fw-bold mb-5">Schedule Form</h2>
									<div class="form-outline mb-4">
										<input type="text" placeholder="Company Name"
											class="form-control" name="cmpname" />
									</div>
									<div class="form-outline mb-4">
										<input type="text" placeholder="Coming Date"
											class="form-control" name="comingdate" />
									</div>
									<div class="form-outline mb-4">
										<input type="text" placeholder="Time" class="form-control"
											name="time" />
									</div>
									<div class="form-outline mb-4">
										<input type="text" placeholder="Mode" class="form-control"
											name="modeofprocess" />
									</div>
									<div class="form-outline mb-4">
										<input type="text" placeholder="Event" class="form-control"
											name="event" />
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
										<input type="text" placeholder="Stipend" class="form-control"
											name="stiphend" />
									</div>
									<div class="form-outline mb-4">
										<input type="text" placeholder="Location" class="form-control"
											name="location" />
									</div>
									<div class="text-center">
										<button type="submit" class="btn btn-primary btn-lg btn-block"
											style="text-align: centre;" value="Submit">Submit</button>
									</div>
									<br>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>