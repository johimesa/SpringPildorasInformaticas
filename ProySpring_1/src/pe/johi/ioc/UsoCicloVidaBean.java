package pe.johi.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {

		// Paso 1. Cargar un contexto - cargar el archivo XML
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

		// Paso 2. Sacar el bean del context
		IEmpleado empleado = context.getBean("miBean", IEmpleado.class);
		
		System.out.println(empleado.getInformes());
		
		context.close();
	}

}
