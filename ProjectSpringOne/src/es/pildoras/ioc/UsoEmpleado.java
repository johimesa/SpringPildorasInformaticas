package es.pildoras.ioc;

public class UsoEmpleado {

	public static void main(String[] args) {
		// Creaci�n del obj. Empleado
		JefeEmpleado jefeEm = new JefeEmpleado();
		
		// Uso de los obj. creados
		System.out.println(jefeEm.getTareas());

	}

}
