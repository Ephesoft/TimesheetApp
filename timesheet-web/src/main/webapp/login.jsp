<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="login" method="post">

		<table>
			<tr>
				<td>Username:</td>
				<td><input type="input" name="usename" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>
			<tr>
				<td><input type="submit" value="login" /></td>
				
					<td><input type="button" value="create new user" onclick="location.href='register.jsp';"/></td>
			</tr>


		</table>

	</form>

</body>
</html>