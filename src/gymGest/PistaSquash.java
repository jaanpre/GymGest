package gymGest;

import java.util.List;

/**
 * Created by ignaciosantonjamolina on 11/5/16.
 */
public class PistaSquash extends Instalacion implements interfaces.pistaDeporteRaqueta{

//    public PistaSquash(String nombre, List<Monitor> monitoresInstalacion, double precioAlquiler){
//        super(nombre, monitoresInstalacion, precioAlquiler);
//
//    }

    public PistaSquash(){
        super();
    }

    @Override
    public void crearReserva() {

        System.out.println("Reserva en Pista de Squash creada");

    }

}


