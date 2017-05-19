package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import beans.Pelicula;

/**
 * Realiza operaciones contra la tabla "Pelicula"
 * 
 * @author ikaslea
 */
public class ModeloPelicula extends Conector {

	/**
	 * Retorna todas las peliculas de la tabla. Si no hay, la lista retorna
	 * vacia
	 * 
	 * @return listado de peliculas O lista vacia
	 */
	public ArrayList<Pelicula> selectAll() {
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from peliculas");

			while (rs.next()) {
				Pelicula pelicula = new Pelicula();
				pelicula.setIdPelicula(rs.getInt("idPelicula"));
				pelicula.setTituloPaisPelicula(rs.getString("tituloPaisPelicula"));
				pelicula.setTituloOriginal(rs.getString("tituloOriginal"));
				pelicula.setAnioPelicula(rs.getInt("anioPelicula"));
				pelicula.setDuracion(rs.getInt("duracion"));
				pelicula.setPais(rs.getString("pais"));
				pelicula.setDirector(rs.getString("director"));
				pelicula.setGuion(rs.getString("guion"));
				pelicula.setMusica(rs.getString("musica"));
				pelicula.setFotografia(rs.getString("fotografia"));
				pelicula.setReparto(rs.getString("reparto"));
				pelicula.setProductora(rs.getString("productora"));
				pelicula.setGenero(rs.getString("genero"));
				pelicula.setSinopsis(rs.getString("sinopsis"));
				pelicula.setPremios(rs.getString("premios"));
				pelicula.setCriticas(rs.getString("criticas"));
				pelicula.setPosterPhoto(rs.getString("posterPhoto"));

				peliculas.add(pelicula);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return peliculas;
	}
	
	public Pelicula selectByTituloOriginal(String tituloOriginal) {
		Pelicula pelicula = null;
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from peliculas where nombre='" + tituloOriginal + "'");
			rs.next();

			pelicula = new Pelicula();
			pelicula.setIdPelicula(rs.getInt("idPelicula"));
			pelicula.setTituloPaisPelicula(rs.getString("tituloPaisPelicula"));
			pelicula.setTituloOriginal(rs.getString("tituloOriginal"));
			pelicula.setAnioPelicula(rs.getInt("anioPelicula"));
			pelicula.setDuracion(rs.getInt("duracion"));
			pelicula.setPais(rs.getString("pais"));
			pelicula.setDirector(rs.getString("director"));
			pelicula.setGuion(rs.getString("guion"));
			pelicula.setMusica(rs.getString("musica"));
			pelicula.setFotografia(rs.getString("fotografia"));
			pelicula.setReparto(rs.getString("reparto"));
			pelicula.setProductora(rs.getString("productora"));
			pelicula.setGenero(rs.getString("genero"));
			pelicula.setSinopsis(rs.getString("sinopsis"));
			pelicula.setPremios(rs.getString("premios"));
			pelicula.setCriticas(rs.getString("criticas"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pelicula;
	}

	public Pelicula selectById(int id) {
		Pelicula pelicula = null;
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from peliculas where idPelicula="+ id );
			rs.next();

			pelicula = new Pelicula();
			pelicula.setIdPelicula(rs.getInt("idPelicula"));
			pelicula.setTituloPaisPelicula(rs.getString("tituloPaisPelicula"));
			pelicula.setTituloOriginal(rs.getString("tituloOriginal"));
			pelicula.setAnioPelicula(rs.getInt("anioPelicula"));
			pelicula.setDuracion(rs.getInt("duracion"));
			pelicula.setPais(rs.getString("pais"));
			pelicula.setDirector(rs.getString("director"));
			pelicula.setGuion(rs.getString("guion"));
			pelicula.setMusica(rs.getString("musica"));
			pelicula.setFotografia(rs.getString("fotografia"));
			pelicula.setReparto(rs.getString("reparto"));
			pelicula.setProductora(rs.getString("productora"));
			pelicula.setGenero(rs.getString("genero"));
			pelicula.setSinopsis(rs.getString("sinopsis"));
			pelicula.setPremios(rs.getString("premios"));
			pelicula.setCriticas(rs.getString("criticas"));
			pelicula.setPosterPhoto("posterPhoto");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pelicula;
	}
}
