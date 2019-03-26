<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >

<title>Welcome</title>
</head>
<body>
	<div style="height: 20px;" class=" ">
		<div class=" navigation ">
			<div class="p-1" style="background: transparent;">
				<nav style="border-radius: 40px"
					class="nav  justify-content fixed-top bg-light p-2"> <a
					class=" navbar-brand text-sm-center nav-link " href="#"> <img
					src="assets/images/logo.jpg" width="30" height="30"
					class="d-inline-block align-top"> On Job Assistant
				</a> <a
					class=" text-sm-right position-relative align-right mx-4 nav-link"
					href="#">Login</a> <a class=" text-sm-right nav-link active"
					href="customerSignUp.html">SignUp</a> <a class=" text-sm-right nav-link" href="#"
					tabindex="-1">Help</a> </nav>
			</div>
		</div>
	</div>
	<div class="container">
	    	<h1 class="display-4 mt-5">${welcome}</h1>
	    
	</div>
	<script
		src="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>