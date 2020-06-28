package pe.johi.ioc;

public class JefeEmpleado implements IEmpleado {
	
	private String email;
	private String nombreEmpresa;

	// Crear campo del Tipo IInforme (interfaz)
	private IInformes informeNuevo;
	
	public JefeEmpleado(IInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de sección";
	}

	@Override
	public String getInformes() {
		return "Informe presentado por el Jefe: " + informeNuevo.getInformes();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
}
