package gymGest;

import interfaces.pistaDeporteRaqueta;

/**
 * Created by ignaciosantonjamolina on 11/5/16.
 */

public class Gimnasio{

    //Anterior public class pistaDeporteRaquetaMaker {

        // A modo de systemload

        private pistaDeporteRaqueta pistaDeTenis;
        private pistaDeporteRaqueta pistaDePadel;
        private pistaDeporteRaqueta pistaDeSquash;

        public Gimnasio(){
            pistaDeTenis = new PistaTenis(1, true);
            pistaDePadel = new PistaPadel(1, true);
            pistaDeSquash = new PistaSquash(1, true);
        }

        public void reservaTenis(){
            pistaDeTenis.crearReserva();
        }
        public void reservaPadel(){
            pistaDePadel.crearReserva();
        }
        public void reservaSquash(){
            pistaDeSquash.crearReserva();
        }
}



