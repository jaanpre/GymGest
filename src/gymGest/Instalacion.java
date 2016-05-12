package gymGest;

import java.time.Instant;
import java.util.List;

public class Instalacion {
	
	private String nombre;
	private List<Monitor> monitoresDeInstalacion;
	private double precioAlquiler;

	public Instalacion(){};

	public Instalacion(String nombre, List<Monitor> monitoresDeInstalacion, double precioAlquiler){
		this.nombre=nombre;
		this.monitoresDeInstalacion=monitoresDeInstalacion;
		this.precioAlquiler=precioAlquiler;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecioAlquiler() {
		return precioAlquiler;
	}
	public void setPrecioAlquiler(int precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	public List<Monitor> getMonitoresDeInstalacion() {
		return monitoresDeInstalacion;
	}

	public Monitor getMonitoresDeInstalacion(String dni) {
		Monitor persona = null;
		for (Monitor monitor : monitoresDeInstalacion) {
			if (monitor.getDni() == dni) {
				persona = monitor;
				break;
			}
		}
		return persona;
	}

	public void addMonitor(Monitor monitor) {
		monitoresDeInstalacion.add(monitor);
	}

	public void DeleteMonitor(String dni) {
		int index = 0;
		for (Monitor monitor : monitoresDeInstalacion) {
			if (monitor.getDni() == dni) {
				monitoresDeInstalacion.remove(index);
				break;
			}
			index++;
		}

	}
	
	
	

}
