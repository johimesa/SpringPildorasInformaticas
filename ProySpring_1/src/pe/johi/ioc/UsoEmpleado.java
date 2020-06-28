package pe.johi.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		// Paso 1. Cargar un contexto - cargar el archivo XML
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Paso 2. Sacar el bean del context
		JefeEmpleado empleado = context.getBean("miBean", JefeEmpleado.class);
		SecretarioEmpleado empleado_2 = context.getBean("miSecretario", SecretarioEmpleado.class);
		
		// Paso 3. Usar el objeto
		System.out.println(empleado.getTareas());
		
		System.out.println(empleado.getInformes());
		
		System.out.println(empleado_2.getTareas());
		
		System.out.println(empleado_2.getInformes());
		
		System.out.println(empleado_2.getEmail());
		System.out.println(empleado_2.getNombreEmpresa());
		
		System.out.println(empleado.getEmail());		
		System.out.println(empleado.getNombreEmpresa());
		// Paso 4. Cerrar el XML
		context.close();
	}
	
}