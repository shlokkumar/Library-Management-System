<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Return The Great Gatsby</title>
</head>
<body
	style="background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);">
	<center>
		<h2>Return The Great Gatsby</h2>
	</center>

	<img
		src="https://qph.ec.quoracdn.net/main-qimg-79e1b906cd11b0d15dc34fcbc6bc40c9"
		alt="Smiley face" height="400" width="400" align="right" hspace="383">
	<h2>
		Enter the Following Details :-
		</h3>
		<form action="/SimpleServletProject/return" method="post">
			<table>
				<tr>
					<td>Customer Number:</td>
					<td><input type="number" name="cno" /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Return!!" /></td>
				</tr>
			</table>
			<%
				session.setAttribute("bnm", "The Great Gatsby");
			%>
		</form>

</body>
</html>