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
	<h2>Exercicios Anaerobico</h2>
	<form action="/cadastroAnaerobico" method="post" class="needs-validation" novalidate>
  
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
    <label for="inputAddress2">Quantidade de repeticao</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="idade" name="qtdeRepeticao">
  </div>
  <div class="form-group">
    <label for="inputAddress2">Peso</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="peso" name="peso">
  </div>
  <div class="form-group">
    <label for="inputAddress2">Aparelho</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="aparelho" name="aparelho">
  </div>
  
  <button type="submit" class="btn btn-success">Cadastrar</button>
</form>
	
</body>
</html>