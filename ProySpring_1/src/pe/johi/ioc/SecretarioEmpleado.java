package pe.johi.ioc;

public class SecretarioEmpleado implements IEmpleado{

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
}
