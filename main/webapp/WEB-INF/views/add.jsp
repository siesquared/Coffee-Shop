<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
<div class="container">
		<h1> Last Shop On The Left</h1>
		<table class="table">
			<tr>
				<th scope="row">User Name</th>
				<td>${user.username}</td>
			</tr>
			<tr>
				<th scope="row">First Name</th>
				<td>${user.firstname}</td>
			</tr>
			<tr>
				<th scope="row">Last Name</th>
				<td>${user.lastname} </td>
			</tr>
			
			<tr>
				<th scope="row">Password</th>
				<td>${user.password} </td>
			</tr>
		</table>
		
		
		<a class="btn link" href="/register">Back </a>
	</div>
</body>
</html>