<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="bootstrap/css/mycss.css" rel="stylesheet">
<title>Student Admission Form</title>
</head>

<!---->
<body>


	<div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">Welcome to DYNN Group</div>
			<div class="panel-body">Signon</div>
			<div class="panel panel-info">
				<form class="form-inline"
					action="/SpringMVC/submitAdmissionFormTu13.html" method="POST">
					<div class="form-group">
					<table></table>
						<span>Student Name : </span><input type="text" class="form-control"
							id="exampleInputEmail3" placeholder="Student Name"
							name="studentName">
						<span>Student's Hobbies : </span><input
							type="text" class="form-control" placeholder="Student Hobbies" name="studentHobbies" />
						<span>Student's Mobile : </span><input type="text" class="form-control" placeholder="Student Mobile"  name="studentMobile" />

						<span>Student's Date of Birth : </span><input type="text" class="form-control" placeholder="Date of Birth" name="studentDOB" />
					</div>






					

					Student's Skill : <select name="studentSkill" multiple>
						<option value="Java Core">Java Core</option>
						<option value="Spring MVC">Spring MVC</option>
						<option value="Visual Basic">Visual Basic</option>
					</select>


					<table>
						<tr>
							<td>Student's Address</td>
						</tr>
						<tr>
							<td>Student Home Number: <input type="text"
								name="address.homeNum"></td>
						</tr>
						<tr>
							<td>Student Street Number: <input type="text"
								name="address.streetNum"></td>
						</tr>
						<tr>
							<td>Student PIN Number: <input type="text"
								name="address.pinCode"></td>
						</tr>
					</table>

					<input type="submit" value="Submit your request form" />
				</form>
			</div>
			<div class="panel panel-danger">
				<form:errors path="student.*" />
			</div>


		</div>
	</div>

	<script src="bootstrap/js/jquery.js"></script>
	<script src="bootstrap/js/bootstrap.js"></script>
</body>
</html>