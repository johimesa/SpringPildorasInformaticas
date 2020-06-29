package pe.johi.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSingletonPrototype {

	public static void main(String[] args) {
		
		// Paso 1. Cargar un contexto - cargar el archivo XML
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// Paso 2. Sacar el bean del context
		SecretarioEmpleado maria = context.getBean("miSecretario", SecretarioEmpleado.class);
		SecretarioEmpleado jose = context.getBean("miSecretario", SecretarioEmpleado.class);
		
		System.out.println(maria);
		System.out.println(jose);
		
		context.close();
	}

}
