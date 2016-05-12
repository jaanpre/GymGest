package gymGest;

import java.util.List;

/**
 * Created by ignaciosantonjamolina on 11/5/16.
 */
public class PistaTenis extends Instalacion implements interfaces.pistaDeporteRaqueta {

//    public PistaTenis(String nombre, List<Monitor> monitoresInstalacion, double precioAlquiler){
//
//        super(nombre, monitoresInstalacion, precioAlquiler);
//
//    }

    public PistaTenis(){}

    @Override
    public void crearReserva() {

            System.out.println("Reserva en Pista de Tenis creada");

    }

}


