<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administração de projetos</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">AppProjeto</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				
				<c:if test="${not empty usuarioLogado}">
				<li><a href="/diretores">Diretor</a></li>
				<li><a href="/gerentes">Gerente</a></li>
				<li><a href="/analistas">Analista</a></li>
				<li><a href="/clientes">Cliente</a></li>
				<li><a href="/projetos">Projeto</a></li>
				</c:if>
			</ul>
			<ul class="nav navbar-nav navbar-right">
			
				<c:if test="${empty usuarioLogado}">
				<li><a href="/usuario"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="/login"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
				</c:if>
						
				<c:if test="${not empty usuarioLogado}">
				<li><a href="#"><span
						class="glyphicon glyphicon-log-out"></span> Logout, ${usuarioLogado.nome}</a></li>
				</c:if>
			</ul>
		</div>
	</nav>

	<div class="container">
		<h4>AppProjeto: Sistema para administração de projetos</h4>
		<p>Olá!!!</p>
	</div>
</body>
</html>