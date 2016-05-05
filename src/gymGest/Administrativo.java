package gymGest;

public class Administrativo extends Empleado{

	public Administrativo(String dni, String nombre, int sueldo) {
		super(dni, nombre, sueldo);
	}

	public int getSueldo() {
		return super.getSueldo()+100;
	}

}
