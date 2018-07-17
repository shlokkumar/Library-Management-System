<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Books Return</title>
</head>
<body
	style="background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);">
	<h2>Enter the Customer Number :-</h2>
	<form action="/SimpleServletProject/return" method="post">
		<table>
			<tr>
				<td>Book Name:</td>
				<td><select name="bookname">
						<option disabled selected value>-- select an option --</option>
						<option value="Harry Potter">Harry Potter</option>
						<option value="Murder on the Orient Express">Murder on
							the Orient Express</option>
						<option value="Game of Thrones">Game of Thrones</option>
						<option value="The Great Gatsby">The Great Gatsby</option>
						<option value="The Da Vinci Code">The Da Vinci Code</option>
						<option value="Goosebumps">Goosebumps</option>
				</select></td>
			</tr>
			<tr>
				<td>Customer Number:</td>
				<td><input type="number" name="cno" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Return!!" /></td>
			</tr>

		</table>
	</form>

</body>
</html>