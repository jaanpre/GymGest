package gymGest;

import fabricas.fabricaPalaGamaAlta;
import fabricas.fabricaPalaGamaBaja;
import fabricas.fabricaPalaGamaMedia;
import fabricas.fabricaPalas;

public class gymGest {
	private List<Cliente> clientes;
	private List<Empleado> empleados;
	
	

	//singleton
	private static gymGest INSTANCE = new gymGest();

	public gymGest(){
		this.clientes = new ArrayList<Cliente>();
		this.empleados = new ArrayList<Empleado>();
	}

	public void addCliente(Cliente cliente){
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
	public void addEmpleado(Empleado empleado){
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
	
	public static void main(String args[]){
		
		
		palaNinyo pn = new palaNinyo();
		palaGamaBaja baja = new palaGamaBaja();
		palaGamaMedia media = new palaGamaMedia();
		palaGamaAlta alta = new palaGamaAlta();
		
//		pn.codigoDePala();
//		baja.codigoDePala();
//		media.codigoDePala();
//		alta.codigoDePala();
		
		// Creo las fábricas
		fabricaPalaGamaBaja fpgb = new fabricaPalaGamaBaja();
		fabricaPalaGamaMedia fpgm = new fabricaPalaGamaMedia();
		fabricaPalaGamaAlta fpga = new fabricaPalaGamaAlta();
		
		//
		fabricaPalas.crearFabricaPalas(fpgb);
		fabricaPalas.crearFabricaPalas(fpgm);
		fabricaPalas.crearFabricaPalas(fpga);
	}

}
