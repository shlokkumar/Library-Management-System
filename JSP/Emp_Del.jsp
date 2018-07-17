<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Employee</title>
</head>
<body
	style="background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);">

	<h2>Enter Details :-</h2>

	<form action="/SimpleServletProject/del" method="post">
		<table>
			<tr>
				<td>Customer Number:</td>
				<td><input type="number" name="cno" /></td>
			</tr>
			<td colspan="2"><input type="submit" value="Delete!!" /></td>
			</tr>
		</table>
	</form>


</body>
</html>