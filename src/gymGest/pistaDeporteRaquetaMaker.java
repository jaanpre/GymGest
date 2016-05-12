package gymGest;

import interfaces.pistaDeporteRaqueta;

/**
 * Created by ignaciosantonjamolina on 11/5/16.
 */

public class pistaDeporteRaquetaMaker {
        private pistaDeporteRaqueta pistaDeTenis;
        private pistaDeporteRaqueta pistaDePadel;
        private pistaDeporteRaqueta pistaDeSquash;

        public pistaDeporteRaquetaMaker(){
            pistaDeTenis = new PistaTenis();
            pistaDePadel = new PistaPadel();
            pistaDeSquash = new PistaSquash();
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



