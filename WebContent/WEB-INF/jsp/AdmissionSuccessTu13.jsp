<%@ page language="java" contentType="text/html"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html">
<link href="bootstrap/css/mycss.css" rel="stylesheet">
<title>សូមស្វាគមន៏</title>
</head>
<body>
<h1>${msg1}</h1>
<table>

<tr>
	<td>Student Name :</td>
	<td>${student.studentName}</td> <!-- we can display the class model here -->
</tr>
<tr>
	<td>Student Hobbies :</td>
	<td>${student.studentHobbies}</td>
</tr>

<tr>
	<td>Student Mobile :</td>
	<td>${student.studentMobile}</td>
</tr>

<tr>
	<td>Student Date of Birth :</td>
	<td>${student.studentDOB}</td>
</tr>

<tr>
	<td>Student Skill :</td>
	<td>${student.studentSkill}</td>
</tr>

<tr></tr>

<tr>
	<td>Student Home Number: ${student.address.homeNum}</td>
	<td>Student Street Number: ${student.address.streetNum}</td>
	<td>Student PIN Number: ${student.address.pinCode}</td>
</tr>
</table>

</body>
</html>