package gymGest;

public class Empleado {
	
	private String dni;
	private String nombre;
	private int sueldo;

	public Empleado (String dni, String nombre, int sueldo){
		this.dni=dni;
		this.nombre=nombre;
		this.sueldo=sueldo;
	}
	
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
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	
	

}
