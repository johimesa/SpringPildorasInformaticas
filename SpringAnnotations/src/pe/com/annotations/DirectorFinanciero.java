package pe.com.annotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleado {

	private CreacionInformeFinanciero informeFinanciero;
	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}
	
	@Override
	public String getTareas() {
		
		return "Gestión y dirección de las operaciones financieras de la empresa";
	}

	@Override
	public String getInformes() {
		
		return informeFinanciero.getInformeFinanciero();
	}

	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
}
