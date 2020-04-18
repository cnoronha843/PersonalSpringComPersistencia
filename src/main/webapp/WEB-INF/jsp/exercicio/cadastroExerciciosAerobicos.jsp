<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de exercicos</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body class="container-fluid" class="jumbotron">
<nav class="navbar navbar-light bg-light" >
  </h1><a class="navbar-brand" href="#">
    <img src="/images/RVB_logo.jpg"  width="30" height="30" class="d-inline-block align-top" alt=""></a><h1>Personal App</h1>
</nav>
	<h1>Cadastro de exercicos</h1>
	<h2>Exercicios Aerobico</h2>
	
	<form action="/cadastroAerobico" method="post" class="needs-validation" novalidate>
  
  <div class="form-group">
    <label for="email">Nome do exercicio</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="nomeDoExercicio"name="nomeDoExercicio">
  </div>
  <div class="form-group">
    <label for="email">Tempo recuperacao</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="tempoRecuperacao"name="tempoRecuperacao">
  </div>
  <div class="form-group">
    <label for="inputAddress2">Quantidade de blocos</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="quantidadeBlocos"name="quantidadeBlocos">
  </div>
  
  <div class="form-group">
    <label for="inputAddress2">Tempo</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="tempo" name="tempo">
  </div>
  <div class="form-group">
    <label for="inputAddress2">Inclinado</label>
    <select name="inclinado">
		<option></option>
			<option value=true>Sim</option>
			<option value=false>Não</option>
			</select> 
			<input type="submit" value="Cadastrar">
  </div>
  
  
  <button type="submit" class="btn btn-success">Cadastrar</button>
</form>
	
</body>
</html>