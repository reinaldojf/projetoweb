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
		<h2>Cadastramento de usuário</h2>
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