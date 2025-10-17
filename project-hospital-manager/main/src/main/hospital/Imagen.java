package hospital;

import java.util.Date;

//Clase para representar imágenes médicas
class Imagen {
	private String nombre;
	private String ruta;
	private Date fecha;

	public Imagen(String nombre, String ruta, Date fecha) {
		this.nombre = nombre;
		this.ruta = ruta;
		this.fecha = fecha;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
