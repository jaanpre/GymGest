package gymGest;

public class Monitor extends Empleado{
	
	boolean monitorNatacion;
	boolean monitorPadel;
	boolean monitorSala;

	public Monitor(String dni, String nombre, int sueldo) {
		super(dni, nombre, sueldo);
	}

	public int getSueldo() {
		return super.getSueldo()+150;
	}

	public boolean isMonitorNatacion() {
		return monitorNatacion;
	}

	public void setMonitorNatacion(boolean monitorNatacion) {
		this.monitorNatacion = monitorNatacion;
	}

	public boolean isMonitorPadel() {
		return monitorPadel;
	}

	public void setMonitorPadel(boolean monitorPadel) {
		this.monitorPadel = monitorPadel;
	}

	public boolean isMonitorSala() {
		return monitorSala;
	}

	public void setMonitorSala(boolean monitorSala) {
		this.monitorSala = monitorSala;
	}

	
}
