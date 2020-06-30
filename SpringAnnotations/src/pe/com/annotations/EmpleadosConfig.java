package pe.com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("pe.com.annotations")
public class EmpleadosConfig {

	// definir el bean para el InformeFinancieroDepCompras
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { // será el ID del bean inyectado
		return new InformeFinancieroDepCompras();
	}
	
	// definir el bean para el DirectorFinanciero
	@Bean
	public Empleado directoFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
}
