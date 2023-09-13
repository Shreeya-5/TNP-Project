<%@page import="tnp.model.AdminLogin"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<%@ include file="index.html"%>
<link rel="stylesheet" href="sidebar.css">
</head>
<body>
<body>

	<div class="container-fluid">
		<div id="mySidebar" class="sidebar">
			<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
			<a href="CompanyAdd.jsp">Add Company</a> <a href="#">Add Training</a>
			<a href="DisplayStudReg">Student Record</a> <a
				href="DisplayCompanyController">Display Companies</a> <a href="#">Display
				Trainings</a> <a href="#">Interview Questions</a>
		</div>
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
						<a href="#AboutUs" class="nav-item nav-link" style="color: white;">About
							us</a>
						<a href="Dashboard.jsp" class="nav-item nav-link"
							style="color: white;">Logout</a>
						<a href="StudProfile.jsp" class="nav-item nav-link"
							style="color: white;"><i class="bi bi-person-circle"
							style="font-size: 1.5rem; color: white;"></i></a>
					</ul>
				</div>
			</div>
		</nav>

		<div class="row">
			<div class="col" style="margin: 20px; max-width: 25%;">
				<h5 style="color: #253b80">Notice</h5>
				<div style="border: 2px solid #dedede; padding: 20px;">
					<div class="container">
						<div style="background-color: #ffdead; height: 440px;">
							<p style="font-size: 14px; padding: 10px;">The Job
								Description form will be displayed on this Online T&P Notice
								Board.</p>
							<p style="font-size: 14px; padding: 10px;">Students are
								requested to read the notice and apply the online form within
								given timeline provided they meet the criteria.</p>
							<p style="font-size: 14px; padding: 10px;">Only those
								students who have submitted data will be permitted to appear for
								the process.</p>
							<p style="font-size: 14px; padding: 10px;">The date of Online
								test and Interview may be different and students are requested
								to visit the Notice Board regularly for the update.</p>
						</div>
					</div>
				</div>
			</div>
			<div class="col" style="max-width: 75%;">
				<div class="row">
					<div class="col" style="margin: 30px;">
						<div style="border: 2px solid #dedede; padding: 30px;">
							<div class="container"
								style="padding: 20px; background-color: #12276a; height: 300px;">
								<li style="color: white;"><a href="PlacementData.jsp"
									style="text-decoration: none; color: white;">List of All
										Companies and Placed Students</a></li>
								<li style="color: white;"><a href="AllTrainings.jsp"
									style="text-decoration: none; color: white;">List of All
										Trainings and Placed Students</a></li>
								<li style="color: white;"><a href="PlacementStatistics.jsp"
									style="text-decoration: none; color: white;">Placement
										Statistics</a></li>
							</div>
						</div>
					</div>
					<div class="col" style="margin: 30px;">
						<div style="border: 2px solid #dedede; padding: 30px;">
							<div class="container"
								style="padding: 20px; background-color: #12276a; height: 300px;">
								<li style="color: white;"><a href="Schedule.jsp"
									style="text-decoration: none; color: white;">Schedule</a></li>
								<li style="color: white;"><a href="Placed.jsp"
									style="text-decoration: none; color: white;">Placed Student</a></li>
								<li style="color: white;"><a href="Experience.jsp"
									style="text-decoration: none; color: white;">Experience</a></li>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col" style="margin: 30px;">
						<div style="border: 2px solid #dedede; padding: 30px;">
							<div class="container"
								style="padding: 20px; background-color: #12276a; height: 300px;">
								<li style="color: white;"><a href="AllJobs.jsp"
									style="text-decoration: none; color: white;">Company</a></li>
								<li style="color: white;"><a href="AllJobs.jsp"
									style="text-decoration: none; color: white;">Training</a></li>
								<li style="color: white;"><a href="AllJobs.jsp"
									style="text-decoration: none; color: white;">Interview
										Questions</a></li>
							</div>
						</div>
					</div>
					<div class="col" style="margin: 30px;">
						<div style="border: 2px solid #dedede; padding: 30px;">
							<div class="container"
								style="padding: 20px; background-color: #12276a; height: 300px;">

								<div class="text-center" style="margin: 20px;">
									<a href="Admin.jsp"
										style="text-decoration: none; color: white; font-size: 30px;">Update
										Data</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container"
		style="height: 400px; background-color: #f7f7f7; max-width: 95%; margin: 35px; padding: 20px;">
		<h5 style="color: #253b80">Reviews</h5>
		<div class="row justify-content-center">
			<div class="col">
				<div class="container"
					style="margin: 20px; background-color: #ffffff; height: 250px; width: 95%;"></div>
			</div>
			<div class="col">
				<div class="container"
					style="margin: 20px; background-color: #ffffff; height: 250px; width: 95%;"></div>
			</div>
			<div class="col">
				<div class="container"
					style="margin: 20px; background-color: #ffffff; height: 250px; width: 95%;"></div>
			</div>
		</div>
	</div>

	<div class="container-fluid"
		style="background-color: #002147; height: 500px; width: 100%;">
		<div class="row">
			<div class="ast-col-lg-3"
				style="width: 25%; padding-left: 30px; padding-right: 30px; margin-top: 20px;">
				<h2 style="color: #a4d9ec; font-size: 14px">CONTACT US</h2>
				<p style="color: #fff; font-size: 13px;">Prof. Amit Rajurkar</p>
				<p style="color: #fff; font-size: 13px;">Contact: Landline
					Direct: 020-25311131/25311132 Mobile: 9822493920</p>
				<p style="color: #fff; font-size: 13px;">Email ids:
					placements@cumminscollege.in</p>
			</div>
			<div class="ast-col-lg-3"
				style="width: 25%; padding-left: 30px; padding-right: 30px; margin-top: 20px;">
				<h2 style="color: #a4d9ec; font-size: 14px">FOLLOW US ON</h2>
				<div class="textwidget">
					<p>
						<a
							href="https://www.facebook.com/MKSSSs-Cummins-College-of-Engineering-for-Women-414256001923074/"
							target="_blank" rel="noopener"><i class="bi bi-facebook"
							style="font-size: 2rem; padding-right: 10px;"></i></a> <a
							href="https://twitter.com/CumminsCollege" target="_blank"
							rel="noopener"><i class="bi bi-twitter"
							style="font-size: 2rem; padding-right: 10px;"></i></a> <a
							href="https://www.youtube.com/user/TheCumminsCollege"
							target="_blank" rel="noopener"><i class="bi bi-youtube"
							style="font-size: 2rem; padding-right: 10px;"></i></a> <a
							href="https://www.linkedin.com/in/mksss-s-cummins-college-of-engineering-pune-5846331ab/"
							target="_blank" rel="noopener"><i class="bi bi-linkedin"
							style="font-size: 2rem; padding-right: 10px;"></i></a> <a
							href="https://www.instagram.com/mksssccoewpune/" target="_blank"
							rel="noopener"><i class="bi bi-instagram"
							style="font-size: 2rem;"></i></a>
					</p>
				</div>

			</div>
			<div class="ast-col-lg-3"
				style="width: 25%; padding-left: 30px; padding-right: 30px; margin-top: 20px;">
				<h2 style="color: #a4d9ec; font-size: 14px">CONTACT</h2>
			</div>
			<div class="ast-col-lg-3"
				style="padding-left: 30px; width: 25%; padding-right: 30px; margin-top: 20px;">
				<h2 style="color: #a4d9ec; font-size: 14px">ABOUT PLACEMENT
					CELL</h2>
				<p style="color: #fff; font-size: 13px;">The real opportunity
					for success lies within the person and not in the job.</p>
				<p style="color: #fff; font-size: 13px;">The College has a
					separate Training and Placement Cell. A Placement Committee
					consisting of one faculty representing each department decides the
					guidelines for the placement activity.</p>

				<p style="color: #fff; font-size: 13px;">As Cummins College has
					become autonomous since 2016, Summer Internship after the
					completion of VIth Semester , for 8-10 weeks, is mandatory for all
					students. Sessions are arranged on Resume Writing, Interview
					Techniques and Aptitude Test. Guest Lectures and Training
					Programmes are arranged for the students.</p>
			</div>
		</div>
	</div>
	<div id="AboutUs"
		style="border-top-style: solid; border-top-width: 1px; border-top-color: #7a7a7a; line-height: 2; position: relative;">
		<div class="container-fluid"
			style="height: 60px; background-color: #002147;">
			<div class="text-center p-3" style="color: #fff; font-size: 14px;">©
				2020 Copyright Cummins College of Engineering, Pune</div>
		</div>
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