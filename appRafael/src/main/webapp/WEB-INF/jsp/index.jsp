<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greenhouse</title>
 	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="/">Greenhouse</a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li><a href="/">Home</a></li>
	      <li><a href="/plant/list">Full Catalog</a></li>
	    </ul>
	    <ul class="nav navbar-nav navbar-right">
	      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
	      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	    </ul>
	  </div>
	</nav>
	
	<div class="container">
	  <h2>Greenhouse</h2>
	  <div id="myCarousel" class="carousel slide" data-ride="carousel">
	    <!-- Indicators -->
	    <ol class="carousel-indicators">
	      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
	      <li data-target="#myCarousel" data-slide-to="1"></li>
	      <li data-target="#myCarousel" data-slide-to="2"></li>
	    </ol>
	
	    <!-- Wrapper for slides -->
	    <div class="carousel-inner">
	
	      <div class="item active">
	        <img src="img/greenhouse.jpg" alt="Los Angeles" style="width:100%;">
	        <div class="carousel-caption">
	          <h3>Home</h3>
	          <p>Is always better to be at home</p>
	        </div>
	      </div>
	
	      <div class="item">
	        <img src="img/plant_upper_view.jpg" alt="Chicago" style="width:100%;">
	        <div class="carousel-caption">
	          <h3>Exotic</h3>
	          <p>We know well every aspect</p>
	        </div>
	      </div>
	    
	      <div class="item">
	        <img src="img/plant_indoor.jpg" alt="New York" style="width:100%;">
	        <div class="carousel-caption">
	          <h3>For every place</h3>
	          <p>We love the Big Apple!</p>
	        </div>
	      </div>
	  
	    </div>
	
	    <!-- Left and right controls -->
	    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
	      <span class="glyphicon glyphicon-chevron-left"></span>
	      <span class="sr-only">Previous</span>
	    </a>
	    <a class="right carousel-control" href="#myCarousel" data-slide="next">
	      <span class="glyphicon glyphicon-chevron-right"></span>
	      <span class="sr-only">Next</span>
	    </a>
	  </div>
	  
	</div>	
</body>
</html>