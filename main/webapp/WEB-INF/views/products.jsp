<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Store Home </title>
</head>
<body>
<div class="container">
		<h1> Last Shop On The Left</h1>
		<table class="table">
			<tr>
				<th scope="row">Name</th>
				<td>${products.name}</td>
			</tr>
			<tr>
				<th scope="row">Description</th>
				<td>${products.description}</td>
			</tr>
			<tr>
				<th scope="row">Price</th>
				<td>${products.price} </td>
			</tr>
		</table>
		
		
		<a class="btn link" href="/register/add">Back </a>
	</div>

</body>
</html>