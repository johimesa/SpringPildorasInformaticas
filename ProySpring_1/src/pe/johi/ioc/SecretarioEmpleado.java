package pe.johi.ioc;

public class SecretarioEmpleado implements IEmpleado{

	@Override
	public String getTareas() {
		
		return "Hago las tareas de mi Jefe el Gerente";
	}
	
	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return null;
	}
}
