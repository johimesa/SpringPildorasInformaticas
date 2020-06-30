package pe.com.annotations;

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

}
