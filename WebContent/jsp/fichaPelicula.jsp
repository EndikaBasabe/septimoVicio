<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>
<%@ page import="beans.*" %>
<%@ page import="modelo.*" %>
<%
//Parametroak jaso.
int id = Integer.parseInt(request.getParameter("idPelicula"));


//idarekin pelicula lortu modeloari eskatuta
ModeloPelicula modeloPelicula = new ModeloPelicula();
Pelicula pelicula = modeloPelicula.selectById(id);








%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>s�ptimoVicio</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  </style>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Projects</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Buscar">
      </div>
      <button type="submit" class="btn btn-default">Enviar</button>
    </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Registrarse</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Iniciar sesi�n</a></li>
      </ul>
    </div>
  </div>
</nav>
 
<div class="container-fluid text-center"> 
  <div class="row content">
    <div class="col-sm-2 sidenav">
      <p><a href="#">Iniciar Sesi�n</a></p>
      <p><a href="#">Registrarse</a></p>
    </div>
    <div class="col-sm-8 text-left"> 
		<%= pelicula.getTituloPaisPelicula() %> <br>
		T�tulo Original: <%= pelicula.getTituloOriginal() %><br>
		A�o: <%= pelicula.getAnioPelicula() %> <br>
		Duraci�n: <%= pelicula.getDuracion() %> <br>
		Pa�s: <%= pelicula.getPais() %> <br>
		Director: <%= pelicula.getDirector() %> <br>
		Gui�n: <%= pelicula.getGuion() %> <br>
		Fotograf�a: <%= pelicula.getFotografia() %> <br> 
		Reparto: <%= pelicula.getReparto() %> <br>
		Productora: <%= pelicula.getProductora() %> <br>
		Genero: <%= pelicula.getGenero() %> <br>
		Sinopsis: <%= pelicula.getSinopsis() %> <br>
		Premios: <%= pelicula.getPremios() %> <br>
		Cr�ticas: <%= pelicula.getCriticas() %> <br>
    </div>
    <div class="col-sm-2 sidenav">
      <div class="well">
        <p>ADS</p>
      </div>
      <div class="well">
        <p>ADS</p>
      </div>
    </div>
  </div>
</div>

<footer class="container-fluid text-center">
  <p>Footer Text</p>
</footer>

</body>
</html>