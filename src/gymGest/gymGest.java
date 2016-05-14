package gymGest;


import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fabricas.*;
//import fabricas.fabricaPalas;
import interfaces.palaPadel;

public class GymGest {
	private List<Cliente> clientes;
	private List<Empleado> empleados;
	// Caso de Uso: Mostrar lista de actividades
	private static List<Clase> actividades;
	// Caso de Uso: Mostrar asistencia
	private static List<Asistencia> asistencia;
	private Gimnasio gim;

	//singleton
	private static GymGest INSTANCE = new GymGest();
	
	//Para systemload...


	public GymGest(){
		this.clientes = new ArrayList<Cliente>();
		this.empleados = new ArrayList<Empleado>();
		this.actividades = new ArrayList<Clase>();
		this.asistencia = new ArrayList<Asistencia>();
		this.gim = new Gimnasio();
	}

	//Gestión de Listas

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
	public boolean addEmpleado(Empleado empleado){
		return empleados.add(empleado);
	}

	public boolean borrar_empleado(Empleado empleado) {
		return empleados.remove(empleado);
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Empleado getEmpleado(String dni) {
		for (Empleado empleado : this.empleados) {
			if (empleado.getDni().equals(dni)) {
				return empleado;
			}
		}
		return null;
	}

	public boolean addActividad(Clase clase) { return actividades.add(clase);}

	public boolean borrar_actividad(Clase clase) { return actividades.remove(clase);}

	public List<Clase> getActividades(){ return actividades; }

	public Clase getClase (DayOfWeek dw, LocalTime lt ){
		for (Clase clase : this.actividades) {
			if (clase.getDw1().equals(dw) && clase.getHora().equals(lt)){
				return clase;
			}
		}
		return null;
	}

	public void muestraClases(){

		for (Clase clase : this.actividades) {
			System.out.println(clase.getDw1()+" y "+clase.getDw2()+" clase de "+ clase.gettC() +
					" Hora: " + clase.getHora() + " Duración " + clase.getDuracion() + " Monitor "+clase.getMonitor().getNombre());
		}

	}

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
	
//	public void palaCliente(Cliente cli, String gama){
//
//		switch(gama){
//		case "baja":
//		palaPadel pb = fabricaPalas.crearFabricaPalas(fpgb);
//		cli.setPa(pb);
//		break;
//		case "media":
//		palaPadel pm = fabricaPalas.crearFabricaPalas(fpgm);
//		cli.setPa(pm);
//		break;
//		case "alta":
//		palaPadel pa = fabricaPalas.crearFabricaPalas(fpga);
//		cli.setPa(pa);
//		break;
//		case "niño":
//		palaPadel pn = fabricaPalas.crearFabricaPalas(fpn);
//		cli.setPa(pn);
//		break;
//		}
//	}

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

	public void apuntarActividad(Clase cla, Cliente cli){
		cla.addCliente(cli);
		System.out.println("Quedan " + cla.getPlazasLibres() + " plazas libres ");
	}

	public String mostrarAsistenciasCliente(Cliente cli){
		String muestra = "";
		for (Asistencia asis : cli.getAsisCliente()){
			 muestra += "Entrada "+(asis.getEntrada().getEntrada()).toString()+" Salida "+(asis.getSalida().getSalida()).toString();
		}
		System.out.println(muestra);
		return muestra;
	}

	public void crearAsistencia(LocalDateTime e, LocalDateTime s, Cliente cli){
		Entrada en;
		Salida sa;
		Asistencia asis = new Asistencia(en = new Entrada(e), sa = new Salida(s), cli);

	}

	public void crearCliente(String dni, String nombre, String direccion, String telefono, palaPadel pa){
		Cliente cli = new Cliente(dni, nombre, direccion, telefono, pa);
		addCliente(cli);
	}

	public void mostrarClientesAhora(){

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
//		actividades.add(padel1);
//		actividades.add(padel2);
//		//gg.muestraClases();
//
//		// Alumno participa en actividad
//		//gg.apuntarActividad(padel1, cli2);
//
//		gg.mostrarAsistenciasCliente(cli);

		(gg.crearPala("media")).codigoDePala();

	}




}
