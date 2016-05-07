<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Teatrul National</title>
</head>
<body>

	<h2>Login</h2>
	<form:form method="POST" action="/theatre/user/login">
		<table>
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" /></td>
			</tr>

			<tr>
				<td><form:label path="parola">Password</form:label></td>
				<td><form:input path="parola" /></td>
			</tr>
			<tr>
				<td ><input type="submit" value="Submit" /></td>
			</tr>

		</table>
	</form:form>


	<form:form method="POST" action="/theatre/user/resetPassword">
		<table>

			<tr>
				<td><form:label path="username">Name</form:label></td>
				<td><form:input path="username" /></td>
			</tr>

			<tr>
				<td><form:label path="parola">New Password</form:label></td>
				<td><form:input path="parola" /></td>
			</tr>


			<tr>
				<td><input type="submit" value="Reset" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>