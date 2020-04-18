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
<nav class="navbar navbar-light bg-light" >
  </h1><a class="navbar-brand" href="#">
    <img src="/images/RVB_logo.jpg"  width="30" height="30" class="d-inline-block align-top" alt=""></a><h1>Personal App</h1>
</nav>

<h1>Cadastro de Professores</h1>

<form action="/cadastroProfessor" method="post" class="needs-validation" novalidate>
  
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
    <label for="inputAddress2">cref</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="cref" name="cref">
  </div>
  
    
  
  <button type="submit" class="btn btn-success">Cadastrar</button>
</form>
	
	
</body>
</html>