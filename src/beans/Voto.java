package beans;

public class Voto {
	
	private int idVoto;
	private int idPelicula;
	private int idUsuario;
	
	
	public Voto(int idVoto, int idPelicula, int idUsuario) {
		super();
		this.idVoto = idVoto;
		this.idPelicula = idPelicula;
		this.idUsuario = idUsuario;
	}


	public Voto() {
		super();
	}


	public int getIdVoto() {
		return idVoto;
	}


	public void setIdVoto(int idVoto) {
		this.idVoto = idVoto;
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
	
	
	
	

}
