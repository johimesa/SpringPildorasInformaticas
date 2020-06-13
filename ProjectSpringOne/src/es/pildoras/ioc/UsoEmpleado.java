package es.pildoras.ioc;

public class UsoEmpleado {

	public static void main(String[] args) {
		// Creación del obj. Empleado
		Empleado jefeEm = new JefeEmpleado();
		
		Empleado secretEm = new SecretarioEmpleado();
		
		Empleado dirEm = new DirectorEmpleado();
		
		// Uso de los obj. creados
		System.out.println(jefeEm.getTareas());
		System.out.println(secretEm.getTareas());
		System.out.println(dirEm.getTareas());
	}
}