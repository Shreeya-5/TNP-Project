<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="index.html"%>
</head>
<body>
	<form action="ScheduleAddedController">
		<div class="container d-flex align-items-center justify-content-center">
		<div
			class="d-flex flex-column min-vh-100 justify-content-center align-items-center">
			<div class="alert alert-success">
				<div
					class="container d-flex align-items-center justify-content-center">
					<strong><h1>Success!</h1></strong><br>
				</div>
				<h1>You Have Added a Schedule Successfully</h1>
			</div>
			<div class="container p-5 my-5 bg-light text-black ">
				<div class="text-center">
				<h3>Do You Want To Add Another Schedule?</h3>
					<a href="Schedule.jsp" type="button"
						class="btn btn-success btn-lg btn-block">Yes</a> <a
						href="AdminHome.jsp" type="button"
						class="btn btn-danger btn-lg btn-block">No</a>
				</div>
			</div>
		</div>
	</div>		
	</form>
</body>
</html>