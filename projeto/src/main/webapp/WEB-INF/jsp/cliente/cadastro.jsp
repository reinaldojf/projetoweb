<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de cliente</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container mt-3">
		<h2>Cadastramento de cliente</h2>
		<form action="/cliente/incluir" method="post">
			<div class="mb-3 mt-3">
				<label>CNPJ:</label> <input type="text" class="form-control"
					placeholder="Entre com o CNPJ" name="cnpj" value="11.111.111/1111-11">
			</div>
			<div class="mb-3 mt-3">
				<label>Razão social:</label> <input type="text" class="form-control"
					placeholder="Entre com a razão social" name="razaosocial" value="Cliente XPTO">
			</div>
			<div class="mb-3 mt-3">
				<label>E-mail:</label> <input type="email" class="form-control"
					placeholder="Entre com o e-mail" name="email" value="xxx@xxx.com.br">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>