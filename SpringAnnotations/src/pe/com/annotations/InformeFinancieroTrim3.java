package pe.com.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		
		return "Presentación del informe de Trimestre 3";
	}

}
