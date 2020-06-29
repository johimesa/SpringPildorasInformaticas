package pe.com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado") // @Component, si lo dejamos así toma el nombre de la clase pero la primera en minúscula
@Scope("prototype")
public class ComercialExperimentado implements Empleado {

	@Override
	public String getTareas() {
		
		return "Vender, vender y vender más";
	}

	@Override
	public String getInformes() {
		
		//return "Informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}
	
	
	//CreacionInformeFinanciero nuevoInforme;
	
	// Segundo paso: Crear Constructor para inyección en clase que lo solicite
	//lo q hace es buscar alguna clase q implemente la interfaz CreacionInformeFinanciero, y si encuentra de ahí obtiene la DI
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	*/
	/*
	// método setter
	@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	} */
	
	/*
	// método cualquiera
	@Autowired
	public void setMetodoCualquiera(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	
	// con atributo
	@Autowired
	@Qualifier("informeFinancieroTrim3") //bean ID q debe utilizar
	CreacionInformeFinanciero nuevoInforme;
}
