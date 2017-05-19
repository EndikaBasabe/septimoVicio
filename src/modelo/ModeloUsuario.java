package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import beans.Usuario;

public class ModeloUsuario extends Conector{
	
public void insert(Usuario usuario){
try{
	PreparedStatement ps = this.conexion.prepareStatement("insert into usuarios(nick,nombreUsuario,contrasena,anoNacimiento,genero,ciudad,pais,email) values(?,?,?,?,?,?,?,?)");
	ps.setString(1,usuario.getNick());
	ps.setString(2, usuario.getNombreUsuario());
	ps.setString(3, usuario.getContrasena());
	ps.setInt(4, usuario.getAnioNacimiento());
	ps.setString(5, usuario.getGenero());
	ps.setString(6, usuario.getCiudad());
	ps.setString(7, usuario.getPais());
	ps.setString(8, usuario.getEmail());
	
	ps.execute();
}catch(SQLException e){
	e.printStackTrace();
}
	
	}
}
