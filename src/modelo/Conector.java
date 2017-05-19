package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Gestiona la conexion con BBDD
 * 
 * @author ikaslea
 */
public class Conector {
	
	protected Connection conexion;

	public Conector() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.conexion = DriverManager.getConnection("jdbc:mysql://" + Config.HOST + "/" + Config.BBDD,
					Config.USERNAME, Config.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
}
