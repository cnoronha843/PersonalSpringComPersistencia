<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Alunos</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body class="container-fluid" class="jumbotron">
<nav class="navbar navbar-light bg-light" >
  </h1><a class="navbar-brand" href="#">
    <img src="/images/RVB_logo.jpg"  width="30" height="30" class="d-inline-block align-top" alt=""></a><h1>Personal App</h1>
</nav>
	<h1>Lista de Alunos:</h1>
	
	<a href="/cadastroAluno"   class="btn btn-primary btn-lg ">Cadastro de Alunos</a>

	<table class="table table-hover">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Whatsapp</th>
				<th>E-mail</th>
				<th>idade</th>
				<th>peso</th>
				<th></th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="aluno" items="${alunosLista}">
				<tr>
					<td>${aluno.nome}</td>
					<td>${aluno.whatsapp}</td>
					<td>${aluno.email}</td>
					<td>${aluno.idade}</td>
					<td>${aluno.peso}</td>
					<td><a href="/aerobico/incluir/${aluno.id}"   class="btn btn-info">+Exercicio Aerobico</a></td>
					<td><a href="/anaerobico/incluir/${aluno.id}"   class="btn btn-info">+Exercicio Musculação</a></td>
					<td><a href="/aluno/detalhe/${aluno.id}"   class="btn btn-info">Detalhes</a></td>
					<td><a href="/aluno/excluir/${aluno.id}"   class="btn btn-danger">Excluir</a></td>
				</tr>
			</c:forEach>
		</tbody>
</body>
</html>