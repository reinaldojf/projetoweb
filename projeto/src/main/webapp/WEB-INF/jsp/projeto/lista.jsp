<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de projeto</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/> 	

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
						<th>Código</th>
						<th>Descrição</th>
						<th>Data início</th>
						<th>Empregado</th>
						<th>Cliente</th>
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
							<td>${o.empregados.size()}</td>
							<td>${o.cliente.razaosocial}</td>
							<td><a href="/projeto/excluir/${o.id}">Excluir</a></td>
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