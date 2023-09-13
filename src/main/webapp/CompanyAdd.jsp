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
		<a href="CompanyAdd.jsp">Add Company</a> <a href="#">Add Training</a> <a
			href="#">Student Record</a> <a href="#">Display Jobs</a> <a href="#">Display
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
					src="CumminsLogo.png" />
				</a> <a><h5>Cummins Placement Cell</h5></a>
				<button class="navbar-toggler" type="button" style="color: white;"
					data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
					<span class="navbar-toggler-icon" style="color: white;"></span>
				</button>
				<div class="collapse navbar-collapse justify-content-end"
					id="collapsibleNavbar">
					<ul class="navbar-nav">
						<li class="nav-item"><a class="nav-link" href="AdminHome.jsp">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="Dashboard.jsp">Logout</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<form action="CompanyController">
			<div class="p-5 bg-image" style="height: 250px;"></div>
			<div class="container-md mx-auto mp-auto mt-5 op">
				<div class="mx-5" style="align-content: center;">
					<div class="card mx-5 md-5 shadow-5-strong justify-content-center"
						style="margin-top: -200px; margin-bottom: 100px;">
						<div class="card-body my-2"
							style="margin-left: -200px; margin-right: -200px;">
							<div class=" my-2">
								<div class="row d-flex justify-content-center"
									style="border: 2px; border-color: gray;">
									<div class="col-lg-5">
										<h2 class="fw-bold mb-5">Company Information</h2>
										<div class="form-outline mb-4">
											<input type="text" placeholder="Company Name"
												class="form-control" name="cmpname" />
										</div>
										<div class="form-outline mb-4">
											<input type="text" placeholder="Website" class="form-control"
												name="website" />
										</div>
										<div class="form-outline mb-4">
											<input type="text" placeholder="Address" class="form-control"
												name="cmpadd" />
										</div>
										<div class="form-outline mb-4">
											<input type="text" placeholder="Mode of Process"
												class="form-control" name="mode" />
										</div>
										<div class="form-outline mb-4">
											<input type="text" placeholder="Online Test Time and Date"
												class="form-control" name="onlitesttimedate" />
										</div>
										<div class="form-outline mb-4">
											<input type="text" placeholder="Interview Time and Date"
												class="form-control" name="interviewtimedate" />
										</div>
										<div class="form-outline mb-4">
											<input type="text" placeholder="Nature of Job"
												class="form-control" name="natureofjob" />
										</div>
										<div class="form-outline mb-4">
											<input type="text" placeholder="Location"
												class="form-control" name="location" />
										</div>
										<div class="form-outline mb-4">
											<input type="text" placeholder="Branches"
												class="form-control" name="branches" />
										</div>
										<div class="form-outline mb-4">
											<input type="text" placeholder="Internship Duration"
												class="form-control" name="internshipdur" />
										</div>
										<div class="form-outline mb-4">
											<input type="text" placeholder="Eligibility Criteria"
												class="form-control" name="elijibility" />
										</div>
										<div class="form-outline mb-4">
											<input type="text" placeholder="Stipend per Month"
												class="form-control" name="stiphend" />
										</div>
										<div class="form-outline mb-4">
											<input type="text" placeholder="Selection Process"
												class="form-control" name="selectionproc" />
										</div>
										<div class="text-center">
											<button type="submit"
												class="btn btn-primary btn-lg btn-block"
												style="text-align: centre;" value="Add">Submit</button>
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