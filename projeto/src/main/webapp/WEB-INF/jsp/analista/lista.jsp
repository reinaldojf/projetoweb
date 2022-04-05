<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de analista</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container mt-3">
		<h2>Cadastramento de analista</h2>
		<form action="/analista">
			<button type="submit" class="btn btn-primary">Novo</button>
		</form>

		<c:if test="${not empty listagem}">
		
			<p>Listagem de analistas (${listagem.size()}):</p>
			<table class="table">
				<thead>
					<tr>
						<th>Id</th>
						<th>cpf</th>
						<th>Nome</th>
						<th>Salário Base</th>
						<th>Salário Final</th>
						<th>Auxílio alimentação</th>
						<th>Auxílio Transporte</th>
						<th>Auxílio escola</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="o" items="${listagem}">
						<tr>
							<td>${o.id}</td>
							<td>${o.cpf}</td>
							<td>${o.nome}</td>
							<td>${o.salariobase}</td>
							<td>${o.salariofinal}</td>
							<td>${o.auxilioalimentacao}</td>
							<td>${o.auxiliotransporte}</td>
							<td>${o.auxilioescola}</td>
							<td><a href="/analista/excluir/${o.id}">Excluir</a></td>
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