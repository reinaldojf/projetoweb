<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de analista</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/> 	

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
						<th>Sal�rio Base</th>
						<th>Sal�rio Final</th>
						<th>Aux�lio alimenta��o</th>
						<th>Aux�lio Transporte</th>
						<th>Aux�lio escola</th>
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
			<p>N�o existem registros a serem exibidos</p>
		</c:if>
	</div>
</body>
</html>