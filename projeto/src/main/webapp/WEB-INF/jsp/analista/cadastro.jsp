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
		<form action="/analista/incluir" method="post">
			<div class="mb-3 mt-3">
				<label>Cpf:</label> <input type="text" class="form-control"
					placeholder="Entre com o CPF" name="cpf" value="111.111.111-11">
			</div>
			<div class="mb-3 mt-3">
				<label>Nome:</label> <input type="text" class="form-control"
					placeholder="Entre com o nome do analista" name="nome" value="Jo?o">
			</div>
			<div class="mb-3 mt-3">
				<label>Sal?rio Base:</label> <input type="text" class="form-control"
					placeholder="Entre com o sal?rio base" name="salariobase" value="10000">
			</div>
			<div class="mb-3 mt-3">
				<label>Sal?rio Final:</label> <input type="text" class="form-control"
					placeholder="Entre com o sal?rio final" name="salariofinal" value="15000">
			</div>
			<div class="mb-3 mt-3">
				<label>Aux?lio alimenta??o:</label> <input type="text" class="form-control"
					placeholder="Entre com o valor do aux?lio alimenta??o" name="auxilioalimentacao" value="1000">
			</div>
			<div class="mb-3 mt-3">
				<label>Aux?lio transporte:</label> <input type="text" class="form-control"
					placeholder="Entre com o aux?lio transporte" name="auxiliotransporte" value="4000">
			</div>
			<div class="mb-3 mt-3">
				<label>Aux?lio escola:</label> <input type="text" class="form-control"
					placeholder="Entre com o aux?lio escola" name="auxilioescola" value="4000">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>