package pe.com.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		// leer el xml de configuracion
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// leer la clase de config.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		// pedir un bean al contenedor
		//Empleado tony = context.getBean("ComercialExperimentado", Empleado.class);
		//Empleado tania = context.getBean("ComercialExperimentado", Empleado.class);
		Empleado empleado = context.getBean("directoFinanciero", Empleado.class); // directoFinanciero, lo traigo de EmpleadosConfig
		DirectorFinanciero director = context.getBean("directoFinanciero", DirectorFinanciero.class);
		
		// usar el bean
		System.out.println(empleado.getInformes());
		System.out.println(empleado.getTareas());
		
		System.out.println("Email del Director: " + director.getEmail());
		System.out.println("Nombre Empresa: " + director.getNombreEmpresa());
		// cerrar con contexto
		context.close();
	}

}
