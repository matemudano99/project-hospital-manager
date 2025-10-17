package hospital;

//Clase abstracta Personal
abstract class Personal {
	protected String id;
	protected String nombre;
	protected String email;
	protected String telefono;
	protected String rol;
	protected Turnos turno;

	public Personal(String id, String nombre, String email, String telefono, String rol) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.rol = rol;
	}

	// Getters y setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Turnos getTurno() {
		return turno;
	}

	public void setTurno(Turnos turno) {
		this.turno = turno;
	}
}