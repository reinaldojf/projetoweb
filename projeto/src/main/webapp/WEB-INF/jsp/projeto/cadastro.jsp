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
		<form action="/projeto/incluir" method="post">
			<div class="mb-3 mt-3">
				<label>C?digo:</label> <input type="text" class="form-control"
					placeholder="Entre com o c?digo" name="codigo"
					value="111.111.111-11">
			</div>
			<div class="mb-3 mt-3">
				<label>Descri??o:</label> <input type="text" class="form-control"
					placeholder="Entre com a descri??o" name="descricao" value="Jo?o">
			</div>
<!--  		<div class="mb-3 mt-3">
				<label>Data in?cio:</label> <input type="text" class="form-control"
					placeholder="Entre com a data de in?cio" name="datainicio"
					value="2020-01-01">
			</div>

			<div class="mb-3 mt-3">
				<label>C?digo do cliente:</label> <input type="text" class="form-control"
					placeholder="Entre com o c?digo do cliente" name="cliente" value="120">
			</div>
	  		<div class="mb-3 mt-3">
					placeholder="Entre com os empregados" name="empregados" value="">
			</div>
-->
	  		<div class="mb-3 mt-3">
				<label>Cliente:</label> 
				<select name="cliente.id" class="form-control">
					<c:forEach var="c" items="${clientes}">
						<option value="${c.id}">${c.razaosocial}</option>
					</c:forEach>
				</select>
			</div>
			<div class="mb-3 mt-3">
				<label>Empregados</label>
				<div class="checkbox">
					<c:forEach var="e" items="${empregados}">
						<label><input type="checkbox" value="${e.id}" name="idsEmpregados">${e.nome}</label>
					</c:forEach>
				</div>
			</div>

			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>