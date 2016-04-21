package gymGest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import fabricas.fabricaPalaGamaAlta;
import fabricas.fabricaPalaGamaBaja;
import fabricas.fabricaPalaGamaMedia;
import fabricas.fabricaPalaNinyo;
import fabricas.fabricaPalas;
import interfaces.palaPadel;

public class gymGest {
	private List<Cliente> clientes;
	private List<Empleado> empleados;
	
	//singleton
	private static gymGest INSTANCE = new gymGest();
	
	//Para systemload...
	fabricaPalaGamaBaja fpgb = new fabricaPalaGamaBaja();
	fabricaPalaGamaMedia fpgm = new fabricaPalaGamaMedia();
	fabricaPalaGamaAlta fpga = new fabricaPalaGamaAlta();
	fabricaPalaNinyo fpn = new fabricaPalaNinyo();	

	public gymGest(){
		this.clientes = new ArrayList<Cliente>();
		this.empleados = new ArrayList<Empleado>();
	}

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
	
	public void palaCliente(Cliente cli, String gama){
		
		switch(gama){
		case "baja":
		palaPadel pb = fabricaPalas.crearFabricaPalas(fpgb);
		cli.setPa(pb);
		break;
		case "media":
		palaPadel pm = fabricaPalas.crearFabricaPalas(fpgm);
		cli.setPa(pm);
		break;
		case "alta":
		palaPadel pa = fabricaPalas.crearFabricaPalas(fpga);
		cli.setPa(pa);
		break;
		case "niño":
		palaPadel pn = fabricaPalas.crearFabricaPalas(fpn);
		cli.setPa(pn);
		break;
		}
	}
	
	
	public static void main(String args[]){
		
		Cliente cli = new Cliente();
		cli.setDni("29209777");
		cli.setNombre("Nacho");
		
		Cliente cli2 = new Cliente();
		cli.setDni("29209778");
		cli.setNombre("Jav");
		
		gymGest gg = new gymGest();
		gg.clientes.add(cli);
		gg.clientes.add(cli2);
		
		gg.palaCliente(cli, "niño");
		gg.palaCliente(cli2, "alta");
		
		cli.getPa();
		cli2.getPa();

		LocalDateTime now = LocalDateTime.now();
		LocalDateTime later = (LocalDateTime.now()).withYear(2017);
		Entrada e = new Entrada(now);
		Salida s = new Salida(later);
		Asistencia asis = new Asistencia(e,s);
		cli.addAsisCliente(asis);


		
		
		
		
		
	}

}
