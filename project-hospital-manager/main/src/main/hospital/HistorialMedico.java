package hospital;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Estructura para Historial Médico
class HistorialMedico {
	private String consulta;
	private TipoHistorial tipo;
	private Date fecha;
	private String diagnostico;
	private String tratamiento;
	private List<Imagen> imagenes;

	public HistorialMedico(String consulta, TipoHistorial tipo, Date fecha, String diagnostico, String tratamiento) {
		this.consulta = consulta;
		this.tipo = tipo;
		this.fecha = fecha;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
		this.imagenes = new ArrayList<>();
	}

	// Getters y setters
	public String getConsulta() {
		return consulta;
	}

	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}

	public TipoHistorial getTipo() {
		return tipo;
	}

	public void setTipo(TipoHistorial tipo) {
		this.tipo = tipo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public List<Imagen> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<Imagen> imagenes) {
		this.imagenes = imagenes;
	}
}
