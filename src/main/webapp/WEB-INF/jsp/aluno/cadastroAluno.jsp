<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>mvc: login</title>
</head>
<body class="container-fluid" class="jumbotron">


<h1>Cadastro de Alunos</h1>

<form action="/cadastroAluno" method="post" class="needs-validation" novalidate>
  
  <div class="form-group">
    <label for="email">nome</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="nome"name="nome">
  </div>
  <div class="form-group">
    <label for="email">email</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="email"name="email">
  </div>
  <div class="form-group">
    <label for="inputAddress2">whatsapp</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="whatsapp"name="whatsapp">
  </div>
  
  <div class="form-group">
    <label for="inputAddress2">idade</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="idade" name="idade">
  </div>
  <div class="form-group">
    <label for="inputAddress2">peso</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="peso" name="peso">
  </div>
  
  <button type="submit" class="btn btn-success">Cadastrar</button>
</form>
	
	
</body>
</html>