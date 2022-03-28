<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Cadastramento de diretor</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container mt-3">
		<h2>Autenticação</h2>
		
		<c:if test="${not empty mensagem}">
		
		  <div class="alert alert-warning">
		    <strong>Problema na autenticação</strong> ${mensagem} } <!-- recebe pelo model este atributo mensagem -->
		  </div>
		  
		</c:if>
		  
		<form action="/login" method="post">
			<div class="mb-3 mt-3">
				<label>Email:</label> <input type="email"
					class="form-control" placeholder="Informe o e-mail"
					name="email" value="reijf@terra.com.br">
			</div>
			<div class="mb-3">
				<label>Password:</label> <input type="password"
					class="form-control" placeholder="Informe a senha"
					name="senha" value="reijf@terra.com.br">
			</div>
			<button type="submit" class="btn btn-primary">Acessar</button>
		</form>
	</div>
</body>
</html>