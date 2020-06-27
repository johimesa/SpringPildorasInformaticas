package pe.johi.ioc;

public class JefeEmpleado implements IEmpleado {

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
}
