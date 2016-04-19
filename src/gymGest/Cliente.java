package gymGest;

import interfaces.palaPadel;

public class Cliente {
	
	String dni;
	String nombre;
	String direccion;
	String telefono;
	palaPadel pa; 	// utilizamos la interfaz que más tardes se 
					// llenará con la pala de la gama adecuada
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public palaPadel getPa() {
		return pa;
	}
	public void setPa(palaPadel pa) {
		this.pa = pa;
	}
	
	
	

}
