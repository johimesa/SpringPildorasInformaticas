package es.pildoras.ioc;

public class SecretarioEmpleado implements Empleado {

	// Creaci�n campo CreacionInformes (interfaz)
	private CreacionInformes informeNuevo;

	// m�todo encargado de hacer la inyecci�n de dependencias
	public void setInformeNuevo(CreacionInformes informeNuevo) {
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
