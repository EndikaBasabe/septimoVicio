package beans;

import java.util.ArrayList;

public class Lista {
	
	private int idPelicula;
	private int idUsuario;
	private ArrayList<Pelicula> peliculas;
	
	
	public Lista(int idPelicula, int idUsuario) {
		super();
		this.idPelicula = idPelicula;
		this.idUsuario = idUsuario;
	}

	public Lista() {
		super();
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}


	
	
	
	
	
	

}
