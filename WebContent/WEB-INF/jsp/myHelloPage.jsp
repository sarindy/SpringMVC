<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="bootstrap/css/mycss.css" rel="stylesheet">


<title>My Hello Page</title>
</head>


<body>

	<h1>${myWelcomeMessage}</h1>
	<h3 class='myh1' style="font-size: 74px;">fdkjaskdfaslkdjflaks</h3>

	<div class="input-group">
		<span class="input-group-addon" id="basic-addon1">Username : </span> <input
			type="text" class="form-control" placeholder="Username"
			aria-describedby="basic-addon1" width="100">
	</div>



	<br />

	<table>
		<c:forEach items="${myLists}" var="list">
			<tr>
				<td>ID : <c:out value="${list}" /></td>
			</tr>
		</c:forEach>
	</table>


	<script src="bootstrap/js/jquery.js"></script>
	<script src="bootstrap/js/bootstrap.js"></script>


</body>
</html>