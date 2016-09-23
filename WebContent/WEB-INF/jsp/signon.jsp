<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="bootstrap/css/mycss.css" rel="stylesheet">
<title>Login Page</title>
</head>
<body>
	<div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">Welcome to DYNN Group</div>
			<div class="panel-body">Signon</div>
			<div class="panel panel-danger">Allert Here</div>

			<div class="panel panel-info">
				<form class="form-inline">
					<div class="form-group">
					
						<label class="sr-only" for="exampleInputEmail3">Email
							address</label> <input type="email" class="form-control"
							id="exampleInputEmail3" placeholder="Username">
					</div>
					<p/>
					
					<div class="form-group">
						
						<label class="sr-only" for="exampleInputPassword3">Password</label>
						<input type="password" class="form-control"
							id="exampleInputPassword3" placeholder="Password">
					</div>
					<p/>
					<div class="checkbox">
						<label> <input type="checkbox"> Remember me
						</label>
					</div>
					<button type="submit" class="btn btn-default">Sign in</button>
				</form>
			</div>




		</div>




		<script src="bootstrap/js/jquery.js"></script>
		<script src="bootstrap/js/bootstrap.js"></script>
</body>
</html>