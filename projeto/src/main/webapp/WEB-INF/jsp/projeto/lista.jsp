<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de projeto</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container mt-3">
		<h2>Cadastramento de projeto</h2>
		<form action="/projeto">
			<button type="submit" class="btn btn-primary">Novo</button>
		</form>

		<c:if test="${not empty listagem}">
		
			<p>Listagem de projetos (${listagem.size()}):</p>
			<table class="table">
				<thead>
					<tr>
						<th>Id</th>
						<th>C�digo</th>
						<th>Descri��o</th>
						<th>Data in�cio</th>
						<!--  <th>Cliente</th> -->
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="o" items="${listagem}">
						<tr>
							<td>${o.id}</td>
							<td>${o.codigo}</td>
							<td>${o.descricao}</td>
							<td>${o.datainicio}</td>
							<!-- <td>${o.cliente}</td> -->
							<td><a href="/projeto/excluir/${o.id}">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		
		<c:if test="${empty listagem}">
			<p>N�o existem registros a serem exibidos</p>
		</c:if>
	</div>
</body>
</html>