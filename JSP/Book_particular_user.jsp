<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Books with user</title>
</head>
<body
	style="background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);">
	<h2>Enter Customer's number to view Issued Books :-</h2>
	<form action="/SimpleServletProject/view" method="post">
		<table>

			<tr>
				<td>Customer Number :-</td>
				<td><input type="number" name="cno" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Details!!" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
