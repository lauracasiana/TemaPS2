<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Admin:</title>
</head>
<body>

	<h2>Spectacol</h2>
	<form:form method="POST" action="/theatre/spectacol">
		<table>
			<tr>
				<td><form:label path="titlu">Titlu</form:label></td>
				<td><form:input path="titlu" /></td>
			</tr>
			<tr>
				<td><form:label path="regia">Regia</form:label></td>
				<td><form:input path="regia" /></td>
			</tr>
			<tr>
				<td><form:label path="distributia">Distributia</form:label></td>
				<td><form:input path="distributia" /></td>
			</tr>
			<tr>
				<td><form:label path="dataPremierei">Data</form:label></td>
				<td><form:input path="dataPremierei" /></td>
			</tr>
			<tr>
				<td><form:label path="nrBilete">Numar bilete</form:label></td>
				<td><form:input path="nrBilete" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Adauga Spectacol" action="/adaugaSpectacol"/></td>
			</tr>

			<tr>
				<td><input type="submit" value="Modifica Spectacol" action="/modificaSpectacol"/></td>
			</tr>

			<tr>
				<td><input type="submit" value="Sterge Spectacol" action="/stergeSpectacol"/></td>
			</tr>

		</table>
	</form:form>

	<h2>Angajat</h2>
	<form:form method="POST" action="/theatre/user/adaugaAng">
		<table>
			<tr>
				<td><form:label path="nume">Nume</form:label></td>
				<td><form:input path="nume" /></td>
			</tr>
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" /></td>
			</tr>

			<tr>
				<td><form:label path="parola">Parola</form:label></td>
				<td><form:input path="parola" /></td>
			</tr>


			<tr>
				<td><input type="submit" value="Adauga angajat" /></td>
			</tr>

		</table>
	</form:form>

	<h2>Angajati :</h2>
	<form:form method="POST" action="/theatre/user/veziAng">
		<c:if test="${!empty user}">
			<table align="center" border="1">
				<tr>
					<th>Nume</th>
					<th>Username</th>
					<th>Parola</th>

				</tr>


				<c:forEach items="${user}" var="user">
					<tr>
						<td><c:out value="${user.getNume()}" /></td>
						<td><c:out value="${user.getUsername()}" /></td>
						<td><c:out value="${user.getParola()}" /></td>


					</tr>
				</c:forEach>
			</table>
		</c:if>
	</form:form>
</body>
</html>


