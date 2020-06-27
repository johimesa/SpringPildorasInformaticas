package pe.johi.ioc;

public class SecretarioEmpleado implements IEmpleado{

	private String email;
	private String nombreEmpresa;
	
	// Crear campo del Tipo IInforme (interfaz)
	private IInformes informeNuevo;
	
	public void setInformeNuevo(IInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		
		return "Hago las tareas de mi Jefe el Gerente";
	}
	
	@Override
	public String getInformes() {
		return "Informe generado por el secretario: " + informeNuevo.getInformes();
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
