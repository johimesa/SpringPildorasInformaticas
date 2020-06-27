package pe.johi.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		// Paso 1. Cargar un contexto - cargar el archivo XML
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Paso 2. Sacar el bean del context
		IEmpleado empleado = context.getBean("miBean", IEmpleado.class);
		IEmpleado empleado_2 = context.getBean("miSecretario", IEmpleado.class);
		
		// Paso 3. Usar el objeto
		System.out.println(empleado.getTareas());
		
		System.out.println(empleado.getInformes());
		
		System.out.println(empleado_2.getTareas());
		
		System.out.println(empleado_2.getInformes());
		
		// Paso 4. Cerrar el XML
		context.close();
	}
	
}