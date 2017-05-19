<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insertar título aquí</title>
</head>
<body>

<%@ page import="modelo.*" %>	
<%@ page import="java.sql.*" %>
<%@ page import="beans.*" %>

<%

//parametroak jaso.
String nick = request.getParameter("nick");
String nombreUsuario = request.getParameter("nombreUsuario");
String contrasena = request.getParameter("contrasena");
int anioNacimiento = Integer.parseInt(request.getParameter("anioNacimiento"));
String genero = request.getParameter("genero");
String ciudad = request.getParameter("ciudad");
String pais = request.getParameter("pais");
String email= request.getParameter("email");

//socio objetua sortu eta bete.

Usuario usuario = new Usuario();
usuario.setNick(nick);
usuario.setNombreUsuario(nombreUsuario);
usuario.setContrasena(contrasena);
usuario.setAnioNacimiento(anioNacimiento);
usuario.setGenero(genero);
usuario.setCiudad(ciudad);
usuario.setPais(pais);
usuario.setEmail(email);


//Modelo socio objetua sortu.

ModeloUsuario modeloUsuario = new ModeloUsuario();

//Modeloarekin insert egin.

modeloUsuario.insert(usuario);
%>

</body>
</html>