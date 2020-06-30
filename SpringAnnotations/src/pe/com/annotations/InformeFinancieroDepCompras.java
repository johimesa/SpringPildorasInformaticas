package pe.com.annotations;

public class InformeFinancieroDepCompras implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		
		return "Informe financiero del Departamento de compras año 2020";
	}

}
