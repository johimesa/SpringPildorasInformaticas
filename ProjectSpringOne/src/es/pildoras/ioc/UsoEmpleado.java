package es.pildoras.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {
	
	public static void main(String[] args) {
		
		// vamos a seguir 4 pasos para usar el config
		// 1. creamos el contexto - cargar el archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. pedirle al contexto el objeto o bean
		Empleado emp1 = contexto.getBean("empleado", Empleado.class);
		
		// 3. usamos el objeto o bean
		System.out.println(emp1.getTareas());
		
		// 4. cerrar el contexto - xml
		contexto.close();
		
		// nota: si quiero q me devuelva otro bean debo de cambiar en el xml
	}
}