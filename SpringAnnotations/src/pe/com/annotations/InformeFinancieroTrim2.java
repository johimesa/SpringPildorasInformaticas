package pe.com.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		
		return "Presentación del informe de Trimestre 2";
	}

}
