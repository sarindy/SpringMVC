<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="bootstrap/css/mycss.css" rel="stylesheet">
<title>Student Admission Form</title>
</head>
<body>

	<h1>STUDENT ADMISSION FORM FOR ENGINNERING COURSE</h1>

	<div>
		<!-- <form action="/SpringMVC/submitAdmissionFormTu11.html" method="POST"> -->
		<form action="/SpringMVC/submitAdmissionFormTu12.html" method="POST">
			<p>
				Student's Name : <input type="text" name="studentName" />
			</p>
			<p>
				Student's Hobbies : <input type="text" name="studentHobbies" />
			</p>
			<p>
				Student's Mobile : <input type="text" name="studentMobile" />
			</p>
			
			<p>
				Student's Date of Birth : <input type="text" name="studentDOB" />
			</p>
			
			<p>
				Student's Skill : <select name="studentSkill" multiple>
									<option value="Java Core">Java Core</option>
									<option value="Spring MVC">Spring MVC</option>
									<option value="Visual Basic">Visual Basic</option>
				                  </select>
			</p>
			
			<input type="submit" value="Submit your request form" />
		</form>
	</div>
	

</body>
</html>