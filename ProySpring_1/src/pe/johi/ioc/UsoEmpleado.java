package pe.johi.ioc;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		// Creación de objetos de tipo empleado
		IEmpleado empleado = new DirectorEmpleado();
		
		// uso de los objetos creados
		System.out.println(empleado.getTareas());
	}

}