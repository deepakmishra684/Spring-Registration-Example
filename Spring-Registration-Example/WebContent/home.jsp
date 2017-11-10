<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>How can I help You...</title>
</head>
<body>

	<center>
		<h1>
			<span style="color: lightblue">Hi Welcome to Spring MVC World</span>
		</h1>
		<h1>
			<span style="color: green">Hi! ${user.username} </span><br>
			<span style="color: green">${user.gender} </span><br>
			<span style="color: green">${user.city} </span><br>
			<span style="color: green">${user.aboutYou} </span><br>
			<span style="color: green">${user.course} </span><br>
		</h1>
		<h1>
			<span style="color: lightblue">This is your home page</span>
		</h1>
	</center>

</body>