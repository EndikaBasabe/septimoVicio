package beans;

public class Pelicula {

	private int idPelicula;
	private String tituloPaisPelicula;
	private String tituloOriginal;
	private int anioPelicula;
	private int duracion;
	private String pais;
	private String director;
	private String guion;
	private String musica;
	private String fotografia;
	private String reparto;
	private String productora;
	private String genero;
	private String sinopsis;
	private String premios;
	private String criticas;
	private String posterPhoto;
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Pelicula(int idPelicula) {
		super();
		this.idPelicula = idPelicula;
	}

	public Pelicula() {
		super();
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getTituloPaisPelicula() {
		return tituloPaisPelicula;
	}

	public void setTituloPaisPelicula(String tituloPaisPelicula) {
		this.tituloPaisPelicula = tituloPaisPelicula;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public int getAnioPelicula() {
		return anioPelicula;
	}

	public void setAnioPelicula(int anioPelicula) {
		this.anioPelicula = anioPelicula;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGuion() {
		return guion;
	}

	public void setGuion(String guion) {
		this.guion = guion;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	public String getFotografia() {
		return fotografia;
	}

	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}

	public String getReparto() {
		return reparto;
	}

	public void setReparto(String reparto) {
		this.reparto = reparto;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getPremios() {
		return premios;
	}

	public void setPremios(String premios) {
		this.premios = premios;
	}

	public String getCriticas() {
		return criticas;
	}

	public void setCriticas(String criticas) {
		this.criticas = criticas;
	}

	public String getPosterPhoto() {
		return posterPhoto;
	}

	public void setPosterPhoto(String posterPhoto) {
		this.posterPhoto = posterPhoto;
	}
}
