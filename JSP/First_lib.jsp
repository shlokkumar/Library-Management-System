<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>

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
	float: left;
}

nav a {
	width: 120px;
	display: block;
	text-decoration: none;
	text-align: center;
	background: #594848;
	font-size: 17px;
	color: white;
	padding: 20px 10px;
	font-family: Arial;
}

nav a:hover {
	background: skyblue;
	color: red;
}

.container {
	max-width: 820px;
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
	font-size: 20px;
	font-weight: bold;
	text-align: center;
	background: #594848;
	color: white;
	font-family: Arial;
	letter-spacing: 1px;
}
</style>

</head>

<body
	style="background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);">

	<center>
		<h1>Welcome to Library Manager</h1>
	</center>
	<br>
	<br>


	<div class="container">
		<a href="Book_Items.jsp">
			<div class="gallery">
				<img
					src="http://fictionfactor.com/blog/wp-content/uploads/2014/05/books.png"
					style="width: 400px; height: 400px;">
				<div class="desc">Books Manager</div>
			</div>
		</a> <a href="Emp_Items.jsp">
			<div class="gallery">
				<img
					src="https://p9cdn4static.sharpschool.com/UserFiles/Servers/Server_414382/Image/clipart-library-biyEpz5iL.gif"
					style="width: 400px; height: 400px;">
				<div class="desc">Customer Manager</div>
			</div>
		</a>

	</div>

	<footer> Made By Shlok Kumar </footer>

</body>
</html>