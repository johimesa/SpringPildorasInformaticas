package es.pildoras.ioc;

public class DirectorEmpleado implements Empleado {

	// Creaci�n campo CreacionInformes (interfaz)
	private CreacionInformes informeNuevo;
	
	// creaci�n de constructor q inyecta la dependencia
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
