<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de cliente</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/> 	

	<div class="container mt-3">
		<h2>Cadastramento de usu?rio</h2>
		<form action="/usuario/incluir" method="post">
			<div class="mb-3 mt-3">
				<label>Nome:</label> <input type="text" class="form-control"
					placeholder="Entre com o nome" name="nome" value="XPTO">
			</div>
			<div class="mb-3 mt-3">
				<label>E-mail:</label> <input type="email" class="form-control"
					placeholder="Entre com o e-mail" name="email" value="xpto@xpto.com.br">
			</div>
			<div class="mb-3 mt-3">
				<label>Senha:</label> <input type="password" class="form-control"
					placeholder="Entre com a senha" name="senha" value="123">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>