package pe.johi.ioc;

public class DirectorEmpleado implements IEmpleado {

	// Crear campo del Tipo IInforme (interfaz)
	private IInformes informeNuevo;
	
	// creación de constructor q inyecta la dependencia
	public DirectorEmpleado(IInformes informe) {
		this.informeNuevo = informe;
	}
	
	@Override
	public String getTareas() {
		
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInformes() {
		
		return "Informe creado por el Director: " + informeNuevo.getInformes();
	}
}
