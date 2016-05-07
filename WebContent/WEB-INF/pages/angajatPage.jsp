
<body>
	<h1>Teatrul National</h1>

	<form:form method="POST" action="/theatre/bilet">
		<table>
			<tr>
				<td><form:label path="spectacol">Spectacol</form:label></td>
				<td><form:input path="spectacol" /></td>
			</tr>
			<tr>
				<td><form:label path="rand">Rand</form:label></td>
				<td><form:input path="rand" /></td>
			</tr>
			<tr>
				<td><form:label path="numar">Numar</form:label></td>
				<td><form:input path="numar" /></td>
			</tr>

			<td colspan="2"><input type="submit" value="AdaugaBilet" /></td>
			</tr>
		</table>
	</form:form>


	<form:form method="POST" action="/theatre/bilet/veziBilete">
		<c:if test="${!empty bilet}">
			<table align="center" border="1">
				<tr>
					<th>Spectacol</th>
					<th>Rand</th>
					<th>Numar Bilete:</th>

				</tr>


				<c:forEach items="${bilet}" var="bilet">
					<tr>
						<td><c:out value="${bilet.getSpectacol()}" /></td>
						<td><c:out value="${bilet.getRand()}" /></td>
						<td><c:out value="${bilet.getNumar()}" /></td>

					</tr>
				</c:forEach>
			</table>
		</c:if>
	</form:form>
</body>
