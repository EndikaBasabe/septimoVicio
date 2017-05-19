package beans;

public class Usuario {
	
	private int idUsuario;
	private String nick;
	private String nombreUsuario;
	private String contrasena;
	private int anioNacimiento;
	private String genero;
	private String ciudad;
	private String pais;
	private String email;
	
	
	public Usuario(int idUsuario, String nick, String nombreUsuario, String contrasena, int anioNacimiento,
			String genero, String ciudad, String pais, String email) {
		super();
		this.idUsuario = idUsuario;
		this.nick = nick;
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.anioNacimiento = anioNacimiento;
		this.genero = genero;
		this.ciudad = ciudad;
		this.pais = pais;
		this.email = email;
	}


	public Usuario(int idUsuario) {
		super();
		this.idUsuario = idUsuario;
	}


	public Usuario() {
		super();
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public int getAnioNacimiento() {
		return anioNacimiento;
	}


	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	

}
