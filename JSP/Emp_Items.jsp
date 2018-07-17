<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Actions!!</title>

<style>
* {
	box-sizing: border-box;
}

body {
	margin: 0;
	background: gray;
}

nav {
	background: #594848;
	width: 100%;
	overflow: auto;
}

ul {
	margin: 0;
	padding: 0;
	list-style: none;
}

li {
	float: center;
	list-style-type: none;
}

nav a {
	width: 200px;
	display: block;
	text-decoration: none;
	text-align: center;
	background: #594848;
	font-size: 20px;
	color: white;
	padding: 20px 10px;
	font-family: Arial;
}

nav a:hover {
	background: LightGray;
	color: white;
}

.container {
	max-width: 1200px;
	margin: auto;
	background: #f2f2f2;
	overflow: auto;
}

.gallery {
	margin: 5px;
	border: 1px solid #ccc;
	float: left;
	width: 390px;
}

.gallery img {
	width: 100%;
	height: auto;
}

.desc {
	padding: 15px;
	text-align: center;
}

footer {
	padding: 10px;
	font-size: 15px;
	font-weight: bold;
	text-align: center;
	background: #594848;
	color: white;
	font-family: Arial;
	letter-spacing: 1px;
}

.link {
	color: Green;
	text-decoration: none;
	background-color: none;
}

a {
	color: blue
}
</style>

</head>
<body
	style="background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);">
	<nav>
	<center>
		<li><h2>
				Select any Operation
				<h2></li>
	</center>
	</nav>

	1.
	<a href="Emp_Add.jsp" style="text-decoration: none">Add a new
		Customer</a>
	<br>
	<br>2.
	<a href="Emp_Del.jsp" style="text-decoration: none">Delete Customer</a>
	<br>
	<br>3.
	<a href="Emp_Upd.jsp" style="text-decoration: none">Update Customer
		Details</a>
	<br>
	<br> 4.
	<a href="/SimpleServletProject/all" style="text-decoration: none" method="get">All Customer
		Details</a>
	<br>
	<br> 5.
	<a href="Book_Items.jsp" style="text-decoration: none">Switch to
		Books Manager</a>
	<br>
	<br> 6.
	<a href="LoginFirst.html" style="text-decoration: none">Switch to
		Different User</a>
	<br>
	<br>
	 6.
	<a href="javascript:window.close();" style="text-decoration: none"><b>Close Application</b></a>
	<br>
	<br>
	



	<footer> <b>Made By Shlok Kumar<b></footer>

</body>
</html>