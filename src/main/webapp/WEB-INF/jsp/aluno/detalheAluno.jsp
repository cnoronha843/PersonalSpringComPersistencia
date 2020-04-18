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
<body class="container" class="container-fluid" class="jumbotron">
<nav class="navbar navbar-light bg-light" >
  </h1><a class="navbar-brand" href="#">
    <img src="/images/RVB_logo.jpg"  width="30" height="30" class="d-inline-block align-top" alt=""></a><h1>Personal App</h1>
</nav>
	<h1>Detalhe do Aluno: ${aluno.nome} </h1>
	
	<a href="//alunos"   class="btn btn-primary btn-lg ">Voltar</a>

	<table class="table table-hover">
		<thead>
			<tr>
				<th>Nome do exercicio</th>
				<th>Tempo recuperacao</th>
				<th>Quantidade de blocos</th>
				<th>Quantidade de repeticao</th>
				<th>peso</th>
				<th>tempo</th>
				<th>Inclinado</th>
				<th></th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="exercicio" items="${exerciciosLista}">
				<tr>
					<td>${exercicio.nomeDoExercicio}</td>
					<td>${exercicio.tempoRecuperacao}</td>
					<td>${exercicio.quantidadeBlocos}</td>
					<td>${exercicio.qtdeRepeticao}</td>
					<td>${exercicio.peso}</td>
					<td>${exercicio.tempo}</td>
					<td>${exercicio.inclinado}</td>
					<td><a href="/exercicio/excluir/${exercicio.id}"   class="btn btn-danger">Excluir</a></td>
				</tr>
			</c:forEach>
		</tbody>
</body>
</html>