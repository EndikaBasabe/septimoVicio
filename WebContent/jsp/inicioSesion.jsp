<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>s�ptimoVicio</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet"	href="../css/gureak.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 450px
}

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
	.row.content {
		height: auto;
	}
}
</style>

</head>
<body>

	<%@page import="beans.*"%>
	<%@page import="modelo.*"%>
	<%@page import="java.util.ArrayList"%>
	

	<%
		ModeloPelicula modeloPelicula = new ModeloPelicula();
		ArrayList<Pelicula> peliculas = modeloPelicula.selectAll();
	%>

	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
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
					<li><a href="../html/formularioRegistro.html"><span class="glyphicon glyphicon-log-in"></span>
							Registrarse</a></li>
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
				<p>
					<a href="#">Iniciar Sesi�n</a>
				</p>
				<p>
					<a href="../html/formularioRegistro.html">Registrarse</a>
				</p>
			</div>
			
			<h1>Iniciar sesi�n</h1>
			<div style="margin:0 auto; text-align: center;">
    <div id="login-wrapper">
                <div id="user-profile-icon"><i class="fa fa-user-o-fa"></i></div>
        <form id="login-form" name="flogin" action="principalLogueado.jsp" method="post">
            <input type="hidden" name="postback" value="1">
            <input type="hidden" name="rp" value="http://www.filmaffinity.com/es/main.html">
            <div class="field">
                <input placeholder="Nombre de usuario:" type="text" size="18" name="nombreUsuario" value="">
            </div>
            <div class="field" style="margin-bottom: 20px;">
                <input placeholder="Contrase�a:" type="password" size="18" name="contrasena" value="">
            </div>
       

            <div id="error-text" class="ui-state-error ui-corner-all"></div>
            <div class="captcha-content"><div id="captcha" style="display:none"></div></div>

            <input class="login-btn" type="submit" name="ok" value="Iniciar sesi�n">
       </form>
    </div>
			
			<br>
	<footer class="container-fluid text-center">
		<p>Footer Text</p>
	</footer>

</body>
</html>