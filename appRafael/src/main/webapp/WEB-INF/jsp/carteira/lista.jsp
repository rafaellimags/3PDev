<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en">
<head>
<title>My Money</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">
	
	<c:if test="${ not empty carteiras }">
	<div class="alert alert-success">
    	<strong>Success!</strong> You should <a href="#" class="alert-link">${ mensagem }</a>
  	</div>		
	</c:if>
	
	<h3><a href="/carteira">Incluir nova carteira</a></h3>
	
	<c:if test="${ not empty carteiras }">
	
	<h2>Suas carteiras cadastradas: ${ carteiras.size() }</h2>
		
	<table class="table table-striped">
	   <thead>
	      <tr>
	        <th>Nome</th>
	        <th>Moeda</th>
	        <th>Saldo</th>
	        <th>Despesas</th>	        
	      </tr>
	    </thead>
	    <tbody>
	    <c:forEach var="carteira" items="${ carteiras }">
	      <tr>
	        <td>${ carteira.nome }</td>
	        <td>${ carteira.moeda }</td>
	        <td>${ carteira.saldo }</td>
	        <td><a href="/carteira/detalhar">Detalhar</a></td>
	        <td><a href="/carteira/excluir">Excluir</a></td>
	      </tr>
	    </c:forEach>
	    </tbody>
	  </table>
 	 </c:if>
	</div>
	
	<c:if test="${ empty carteiras }">
		<h2>N�o existem carteiras cadastradas!</h2>
	</c:if>
</body>
</html>
