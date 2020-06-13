package es.pildoras.ioc;

public class SecretarioEmpleado implements Empleado {

	// Creación campo CreacionInformes (interfaz)
	private CreacionInformes informeNuevo;
	
	public SecretarioEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInformes() {
		
		return "Informe creado por el empleado: " + informeNuevo.getInforme();
	}

}
