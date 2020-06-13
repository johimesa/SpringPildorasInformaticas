package es.pildoras.ioc;

public class JefeEmpleado implements Empleado {

	// Creaci�n campo CreacionInformes (interfaz)
	private CreacionInformes informeNuevo;
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Gestiona las cuestiones relativas a mis empleados de Secci�n.";
	}

	@Override
	public String getInformes() {
		
		return "Informe creado por el Jefe con algunas correcciones: " + informeNuevo.getInforme();
	}
}
