package hospital;

import java.time.LocalTime;
import java.util.Date;

//Clase Medico
class Medico extends Personal {
	private String especialidad;

	
	public Medico(String id, String nombre, String email, String telefono, String especialidad) {
		super(id, nombre, email, telefono, "Médico");
		this.especialidad = especialidad;
	}

	public Cita asignarCita(Paciente p) {
		return new Cita(new Date(), this, p, LocalTime.of(1, 0), "Programada");
	}

	public String crearDiagnostico(String id, String informe) {
		return "Diagnóstico creado para paciente " + id + ": " + informe;
	}

	public HistorialMedico registrarHistorial(String id) {
		return new HistorialMedico("Consulta médica", TipoHistorial.CONSULTA, new Date(), "", "");
	}

	public HistorialMedico consultarHistorial(String id) {
		for (Paciente p : MainUI.listaPacientes) {
			if (p.getId().equals(id)) {
				return p.getHistorialMedico();
			}
		}
		return null;
	}

	public void recetarMedicacion(String id) {
		System.out.println("Medicación recetada para paciente: " + id);
	}

	public void actualizarEstadoCita(Cita c) {
		c.setEstado("Completada");
	}

	public void pedirExamenes(Paciente p) {
		System.out.println("Exámenes solicitados para: " + p.getNombre());
	}

	// Getters y setters
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
}
