<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Books</title>

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
	font-size: 20px;
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
		<ul>
			<li><a href="/SimpleServletProject/ball" style="text-decoration: none">
					<div class="link">
						<b>All Issued Books</b>
					</div>
			</a></li>
			<li><a href="Book_user.jsp" style="text-decoration: none">
					<div class="link">
						<b>Books Issued by User</b>
					</div>
			</a></li>
			<li><a href="Emp_Items.jsp" style="text-decoration: none">
					<div class="link">
						<b>Switch to Customer Manager</b>
					</div>
			</a></li>

			<li><a href="LoginFirst.html" style="text-decoration: none">
					<div class="link">
						<b>Switch to Different User</b>
					</div>
			</a></li>
			<li><a href="javascript:window.close();"><div class="link">
						<b>Close Application</b>
					</div></a> </li>




		</ul>

	</nav>

	<div class="container">

		<div class="gallery">
			<img
				src="https://s2982.pcdn.co/wp-content/uploads/2014/08/HP_hc_new_1.jpeg"
				style="width: 400px; height: 400px;">
			<div class="desc">
				<a href="HP_Issue.jsp" style="text-decoration: none">Issue</a>&nbsp;
				<a href="HP_Return.jsp" style="text-decoration: none">Return</a>&nbsp;<b>
					Harry Potter</b>
			</div>

		</div>


		<div class="gallery">
			<img
				src="https://s1.thcdn.com/productimg/600/600/11641313-4394539042643383.jpg"
				style="width: 400px; height: 400px;">
			<div class="desc">
				<a href="MOE_Issue.jsp" style="text-decoration: none">Issue</a>&nbsp;
				<a href="MOE_Return.jsp" style="text-decoration: none">Return</a>&nbsp;<b>
					Murder on the Orient Express</b>
			</div>

		</div>

		<div class="gallery">
			<img
				src="http://www.rachelneumeier.com/wp-content/uploads/2013/05/GameOfThrones1.jpg"
				style="width: 400px; height: 400px;">
			<div class="desc">
				<a href="GOT_Issue.jsp" style="text-decoration: none">Issue</a>&nbsp;
				<a href="GOT_Return.jsp" style="text-decoration: none">Return</a>&nbsp;<b>
					Game of Thrones</b>
			</div>

		</div>


		<div class="gallery">
			<img
				src="https://qph.ec.quoracdn.net/main-qimg-79e1b906cd11b0d15dc34fcbc6bc40c9"
				style="width: 400px; height: 400px;">
			<div class="desc">
				<a href="GG_Issue.jsp" style="text-decoration: none">Issue</a>&nbsp;
				<a href="GG_Return.jsp" style="text-decoration: none">Return</a>&nbsp;<b>
					The Great Gatsby</b>
			</div>

		</div>

		<div class="gallery">
			<img
				src="https://stateofmind13.files.wordpress.com/2013/03/dan-brown-davinci-code-book-cover.jpg"
				style="width: 400px; height: 400px;">
			<div class="desc">
				<a href="DV_Issue.jsp" style="text-decoration: none">Issue</a>&nbsp;
				<a href="DV_Return.jsp" style="text-decoration: none">Return</a>&nbsp;<b>
					The Da Vinci Code</b>
			</div>

		</div>

		<div class="gallery">
			<img src="https://i.imgur.com/1I4benO.jpg"
				style="width: 400px; height: 400px;">
			<div class="desc">
				<a href="G_Issue.jsp" style="text-decoration: none">Issue</a>&nbsp;
				<a href="G_Return.jsp" style="text-decoration: none">Return</a>&nbsp;<b>
					Goosebumps</b>
			</div>

		</div>




	</div>

	<footer>

		<!-- <input type="button" value="Close this window" onclick="self.close()"> -->
		<button onclick="self.close()">Close</button>
	</footer>



</body>
</html>