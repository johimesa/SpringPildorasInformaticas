package pe.com.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		
		// leer el xml de configuracion
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// pedir un bean al contenedor
		Empleado tony = context.getBean("ComercialExperimentado", Empleado.class);
		
		// usar el bean
		System.out.println(tony.getInformes());
		System.out.println(tony.getTareas());
		
		// cerrar con contexto
		context.close();
	}

}
