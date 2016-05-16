package gymGest;

import interfaces.palaPadel;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String dni;
	String nombre;
	String direccion;
	String telefono;
	palaPadel pa;
	public List<Asistencia>  asisCliente = new ArrayList<Asistencia>();
	public List<Reserva> reservasPorCliente = new ArrayList<Reserva>();

	public Cliente(String dni, String nombre, String direccion, String telefono, palaPadel pa) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.pa = pa;
	}

	public List<Asistencia> getAsisCliente() {
		return asisCliente;
	}

	public void setAsisCliente(List<Asistencia> asisCliente) {
		this.asisCliente = asisCliente;
	}

	public void addAsisCliente(Asistencia asis){
		asisCliente.add(asis);
	}

	public List<Reserva> getReservasPorCliente() {
		return reservasPorCliente;
	}

	public void setReservasPorCliente(List<Reserva> reservasPorCliente) {
		this.reservasPorCliente = reservasPorCliente;
	}


	public void addReservaPorCliente(Reserva res){
		for(Reserva re: GymGest.getReservas()){
			if(res.getAño() == re.getAño() &&
					res.getMes() == re.getMes() &&
						res.getDia() == re.getDia() &&
							res.getHora() == re.getHora() &&
								res.getMinutos() == re.getMinutos() &&
									res.getPista() == re.getPista()){
										System.out.println("Ocupado");}
			else{
				reservasPorCliente.add(res);

				switch (res.getPista()) {
					case "tenis1":
						GymGest.getGim().reservaTenis();
					case "tenis2":
						GymGest.getGim().reservaTenis2();
					case "padel1":
						GymGest.getGim().reservaPadel();
					case "padel2":
						GymGest.getGim().reservaPadel2();
					case "squash1":
						GymGest.getGim().reservaSquash();
					case "squash2":
						GymGest.getGim().reservaSquash2();

				}
			}
		}

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
	public palaPadel getPa() {
		return pa;
	}
	public void setPa(palaPadel pa) {
		this.pa = pa;
	}

}
