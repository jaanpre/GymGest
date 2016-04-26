package gymGest;

import interfaces.PalaPadel;
import interfaces.Recibo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String dni;
	private String nombre;
	private String direccion;
	private String telefono;
	private PalaPadel pa;
	private Recibo recibo;
	private List<Actividad> activCliente;
	private List<Asistencia>  asisCliente = new ArrayList<Asistencia>();

	public List<Asistencia> getAsisCliente() {
		return asisCliente;
	}
	public void setAsisCliente(List<Asistencia> asisCliente) {
		this.asisCliente = asisCliente;
	}
	public void addAsisCliente(Asistencia asis){
		asisCliente.add(asis);
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

	public PalaPadel getPa() {
		return pa;
	}
	public void setPa(PalaPadel pa) {
		this.pa = pa;
	}




}
