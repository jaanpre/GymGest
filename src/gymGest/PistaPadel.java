package gymGest;

import java.util.List;

public class PistaPadel extends Instalacion implements interfaces.pistaDeporteRaqueta  {



//	public PistaPadel(String nombre, List<Monitor> monitoresInstalacion, double precioAlquiler){
//
//		super(nombre, monitoresInstalacion, precioAlquiler);
//
//	}

	public PistaPadel(){
		super();
	}

	@Override
	public void crearReserva() {

		System.out.println("Reserva en Pista de Padel creada");

	}
}
