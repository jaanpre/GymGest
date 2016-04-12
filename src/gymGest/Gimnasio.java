package gymGest;

import java.util.List;

public class Gimnasio {
	
	private List<Empleado> listaEmpleados;
	String direccion;
	
	public void add_Empleado(Empleado e){
		listaEmpleados.add(e);
	}
	
	public boolean borrar_Empleado(Empleado e){
		return listaEmpleados.remove(e);
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
