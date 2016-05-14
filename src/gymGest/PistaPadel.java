package gymGest;

import java.util.List;

public class PistaPadel extends Pista implements interfaces.pistaDeporteRaqueta  {

	public PistaPadel(int id, boolean luz){

		super(id, luz);

	}

	@Override
	public void crearReserva() {

		System.out.println("Reserva en Pista de Padel creada");

	}

}
