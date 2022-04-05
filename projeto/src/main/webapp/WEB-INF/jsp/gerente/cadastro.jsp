<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de gerente</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container mt-3">
		<h2>Cadastramento de gerente</h2>
		<form action="/gerente/incluir" method="post">
			<div class="mb-3 mt-3">
				<label>Cpf:</label> <input type="text" class="form-control"
					placeholder="Entre com o CPF" name="cpf" value="111.111.111-11">
			</div>
			<div class="mb-3 mt-3">
				<label>Nome:</label> <input type="text" class="form-control"
					placeholder="Entre com o nome do diretor" name="nome" value="João">
			</div>
			<div class="mb-3 mt-3">
				<label>Salário Base:</label> <input type="text" class="form-control"
					placeholder="Entre com o salário base" name="salariobase" value="10000">
			</div>
			<div class="mb-3 mt-3">
				<label>Salário Final:</label> <input type="text" class="form-control"
					placeholder="Entre com o salário final" name="salariofinal" value="15000">
			</div>
			<div class="mb-3 mt-3">
				<label>Gratificação gerente:</label> <input type="text" class="form-control"
					placeholder="Entre com o valor do bônus" name="gratificacaogerente" value="1000">
			</div>
			<div class="mb-3 mt-3">
				<label>Auxílio gasolina:</label> <input type="text" class="form-control"
					placeholder="Entre com o auxílio para vôo" name="auxiliogasolina" value="4000">
			</div>
			<div class="mb-3 mt-3">
				<div class="checkbox">
					<label><input type="checkbox" value="true" name="participacaolucros">Participação nos lucros</label>
				</div>
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>