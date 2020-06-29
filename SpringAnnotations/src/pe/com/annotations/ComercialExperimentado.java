package pe.com.annotations;

import org.springframework.stereotype.Component;

@Component("comercialExperimentado")
public class ComercialExperimentado implements Empleado {

	@Override
	public String getTareas() {
		
		return "Vender, vender y vender más";
	}

	@Override
	public String getInformes() {
		
		return "Informe generado por el comercial";
	}

}
