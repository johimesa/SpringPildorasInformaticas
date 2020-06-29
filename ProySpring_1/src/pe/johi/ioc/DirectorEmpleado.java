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
	
	// método init q ejecutaría tareas justo antes q el bean esté disponible, no siempre es void y puede llamarse como sea
	public void init() {
		System.out.println("Dentro del init, van tareas a ejecutar antes q el bean esté listo");
	}
	
	// método destroy q ejecutaría tareas justo después q el bean haya sido utilizado
	public void destroy() {
		System.out.println("Dentro del destroy, van tareas a ejecutar después de utilizar el bean");
	}
}
