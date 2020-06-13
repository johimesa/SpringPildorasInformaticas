package es.pildoras.ioc;

public class UsoEmpleado {

	public static void main(String[] args) {
		// Creación del obj. Empleado
		Empleado jefeEm = new JefeEmpleado();
		
		// Uso de los obj. creados
		System.out.println(jefeEm.getTareas());

	}

}
