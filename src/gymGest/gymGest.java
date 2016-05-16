package gymGest;


import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

import fabricas.*;
//import fabricas.fabricaPalas;
import interfaces.palaPadel;

public class GymGest {
	private List<Cliente> clientes;
	private List<Monitor> monitores;
	private static List<Clase> clases;
	private static List<Asistencia> asistencia;
	private static List<Reserva> reservas;
	private static Gimnasio gim;

	//singleton
	private static GymGest INSTANCE = new GymGest();
	
	//Para systemload...


	public GymGest(){
		this.clientes = new ArrayList<Cliente>();
		this.monitores = new ArrayList<Monitor>();
		this.clases = new ArrayList<Clase>();
		this.asistencia = new ArrayList<Asistencia>();
		this.reservas = new ArrayList<Reserva>();
		this.gim = new Gimnasio();
	}

	//List clientes

	public boolean addCliente(Cliente cliente){
		return clientes.add(cliente);
	}
	public boolean borrar_cliente(Cliente client) {
		return clientes.remove(client);
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public Cliente getCliente(String dni) {
		for (Cliente cliente : this.clientes) {
			if (cliente.getDni().equals(dni)) {
				return cliente;
			}
		}
		return null;
	}
	public void crearCliente(String dni, String nombre, String direccion, String telefono, palaPadel pa){
		Cliente cli = new Cliente(dni, nombre, direccion, telefono, pa);
		addCliente(cli);
	}

	//List monitores

	public boolean addMonitor(Monitor monitor){
		return monitores.add(monitor);
	}
	public boolean removeMonitor(Monitor monitor) {return monitores.remove(monitor);}
	public List<Monitor> getEmpleados() {
		return monitores;
	}
	public void setEmpleados(List<Empleado> empleados) {
		this.monitores = monitores;
	}
	public Empleado getEmpleado(String dni) {
		for (Empleado empleado : this.monitores) {
			if (empleado.getDni().equals(dni)) {
				return empleado;
			}
		}
		return null;
	}

	//List Clases
	public boolean addActividad(Clase clase) { return clases.add(clase);}
	public boolean removeClase(Clase clase) { return clases.remove(clase);}
	public List<Clase> getClases(){ return clases; }
	public Clase getClase (DayOfWeek dw, LocalTime lt ){
		for (Clase clase : this.clases) {
			if (clase.getDw1().equals(dw) && clase.getHora().equals(lt)){
				return clase;
			}
		}
		return null;
	}

	public void muestraClases(){
		for (Clase clase : this.clases) {
			System.out.println(clase.getDw1()+" y "+clase.getDw2()+" clase de "+ clase.gettC() +
					" Hora: " + clase.getHora() + " Duración " + clase.getDuracion() + " Monitor "+clase.getMonitor().getNombre());
		}

	}







	//List Asistencia
	public boolean addAsistencia(Asistencia asis){
		return asistencia.add(asis);
	}

	// este método no sé si vale para algo, pero hace lo que dice el nombre
	public String getAsistenciaPorCliente(Cliente cli){
		String aPorCli="";
		for(Asistencia aCli : asistencia){
			if(aCli.getCli().equals(cli)) aPorCli+= aCli.getEntrada()+"";
		}
		return aPorCli;
	}

	public String mostrarAsistenciasCliente(Cliente cli){
		String muestra = "";
		for (Asistencia asis : cli.getAsisCliente()){
			muestra += "Entrada "+(asis.getEntrada().getEntrada()).toString()+" Salida "+(asis.getSalida().getSalida()).toString();
		}
		System.out.println(muestra);
		return muestra;
	}

	// List Reserva

	public static List<Reserva> getReservas(){
		return reservas;
	}
	public static void addReserva(Reserva res){
		reservas.add(res);
	}

	//

	public static Gimnasio getGim() {
		return gim;
	}

	public static void setGim(Gimnasio gim) {
		GymGest.gim = gim;
	}


	// CU: Alquiler

	public palaPadel crearPala (String gama){

		switch(gama){
		case "baja":
			 return factoryProducer.getFactory("baja").crearPala();
		case "media":
			return factoryProducer.getFactory("media").crearPala();
		case "alta":
			return factoryProducer.getFactory("alta").crearPala();
		case "ninyo":
			return factoryProducer.getFactory("ninyo").crearPala();
		}
		return null;
	}





	public void apuntarclase(Clase cla, Cliente cli){
		cla.addCliente(cli);
		System.out.println("Quedan " + cla.getPlazasLibres() + " plazas libres ");
	}



	public void crearAsistencia(LocalDateTime e, LocalDateTime s, Cliente cli){
		Entrada en;
		Salida sa;
		Asistencia asis = new Asistencia(en = new Entrada(e), sa = new Salida(s), cli);

	}





	
	
	public static void main(String args[]){

//		Cliente cli = new Cliente("777","Nacho", "gcivil", "664", null);
//		Cliente cli2 = new Cliente("777","Pep", "gcivil", "664", null);
//
		GymGest gg = new GymGest();
//		gg.clientes.add(cli);
//		gg.clientes.add(cli2);
//
////		gg.palaCliente(cli, "niño");
////		gg.palaCliente(cli2, "alta");
//
//
//
//		cli.getPa();
//		cli2.getPa();
//
//		// Prueba: Añadir una entrada y una salida a un cliente determinado
//
//		LocalDateTime now = LocalDateTime.now();
//		LocalDateTime later = (LocalDateTime.now()).withYear(2018);
//		Entrada e = new Entrada(now);
//		Salida s = new Salida(later);
//		Asistencia asis = new Asistencia(e, s, cli);
//		cli.addAsisCliente(asis);
//
//		// Prueba añadir un par de clase y listar las clases
//		Monitor nacho = new Monitor("200333444","Nacho",4500);
//		Clase padel1 = new Clase(DayOfWeek.MONDAY , DayOfWeek.WEDNESDAY, Clase.tipoClase.PADEL, LocalTime.of(10,00) , 60, nacho);
//		Clase padel2 = new Clase(DayOfWeek.TUESDAY , DayOfWeek.THURSDAY, Clase.tipoClase.PADEL, LocalTime.of(11,00) , 60, nacho);
//		clases.add(padel1);
//		clases.add(padel2);
//		//gg.muestraClases();
//
//		// Alumno participa en clase
//		//gg.apuntarclase(padel1, cli2);
//
//		gg.mostrarAsistenciasCliente(cli);

		(gg.crearPala("media")).codigoDePala();

	}




}
