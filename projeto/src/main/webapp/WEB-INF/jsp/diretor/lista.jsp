<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de diretor</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container mt-3">
		<h2>Cadastramento de diretor</h2>
		<form action="/diretor">
			<button type="submit" class="btn btn-primary">Novo</button>
		</form>

		<c:if test="${not empty listagem}">
		
			<p>Listagem de diretores (${listagem.size()}):</p>
			<table class="table">
				<thead>
					<tr>
						<th>cpf</th>
						<th>Nome</th>
						<th>Salário Base</th>
						<th>Salário Final</th>
						<th>Bônus de diretor</th>
						<th>Auxílio vôo</th>
						<th>Cartão Corporativo</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="o" items="${listagem}">
						<tr>
							<th>${o.cpf}</th>
							<th>${o.nome}</th>
							<th>${o.salariobase}</th>
							<th>${o.salariofinal}</th>
							<th>${o.bonusdiretor}</th>
							<th>${o.auxiliovoo}</th>
							<th>${o.cartaocorporativo}</th>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		
		<c:if test="${empty listagem}">
			<p>Não existem registros a serem exibidos</p>
		</c:if>
	</div>
</body>
</html>