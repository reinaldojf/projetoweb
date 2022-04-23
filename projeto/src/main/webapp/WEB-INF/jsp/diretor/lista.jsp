<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de diretor</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/> 	
	
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
						<th>Id</th>
						<th>cpf</th>
						<th>Nome</th>
						<th>Salário Base</th>
						<th>Salário Final</th>
						<th>Bônus de diretor</th>
						<th>Auxílio vôo</th>
						<th>Cartão Corporativo</th>
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
							<td>${o.bonusdiretor}</td>
							<td>${o.auxiliovoo}</td>
							<td>${o.cartaocorporativo}</td>
							<td><a href="/diretor/excluir/${o.id}">Excluir</a></td>
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