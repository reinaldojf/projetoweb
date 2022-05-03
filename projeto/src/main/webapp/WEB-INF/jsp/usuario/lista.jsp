<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de usuário</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/> 	

	<div class="container mt-3">
		<h2>Cadastramento de Usuários</h2>

		<c:if test="${not empty listagem}">
		
			<p>Listagem de usuários (${listagem.size()}):</p>
			<table class="table">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nome</th>
						<th>E-mail</th>
						<th>Clientes</th>
						<th>Empregados</th>
						<th>Projetos</th>
						<c:if test="${usuarioLogado.admin}">
							<th></th>
						</c:if>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="o" items="${listagem}">
						<tr>
							<td>${o.id}</td>
							<td>${o.nome}</td>
							<td>${o.email}</td>
							<td>${o.clientes.size()}</td>
							<td>${o.empregados.size()}</td>
							<td>${o.projetos.size()}</td>
							<c:if test="${usuarioLogado.admin}">
								<td><a href="/usuario/excluir/${o.id}">Excluir</a></td>
							</c:if>
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