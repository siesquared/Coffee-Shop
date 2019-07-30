<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new user</title>
</head>
<body>
<div class="container">
		<h1>Last Shop On The Left </h1>
		<h2> Register now  for amazing deals!</h2>
		
		<form action="/register/add" method="post">
		<table class="table">
			<tr>
				<th scope="row">User Name </th>
				<td><input type="text" name="username" autofocus/></td>
			</tr>
			<tr>
				<th scope="row">First Name</th>
				<td><input type="text" name="firstname" /></td>
			</tr>
			<tr>
				<th scope="row">Last Name</th>
				<td><input type="text" name="lastname" /></td>
			</tr>
			<tr>
				<th scope="row">Password</th>
				<td><input type="password" name="password"/></td>
			</tr>
			
		</table>
		<button type="submit" href="/thanks">Add</button>
		<a class="btn link" href="/register">Cancel</a>
		</form>
	</div>
</body>
</html>