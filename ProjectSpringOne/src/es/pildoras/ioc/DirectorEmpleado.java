package es.pildoras.ioc;

public class DirectorEmpleado implements Empleado {

	// Creación campo CreacionInformes (interfaz)
	private CreacionInformes informeNuevo;
	
	// creación de constructor q inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInformes() {
		
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}

}
