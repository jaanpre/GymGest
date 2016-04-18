package gymGest;

import fabricas.fabricaPalaGamaAlta;
import fabricas.fabricaPalaGamaBaja;
import fabricas.fabricaPalaGamaMedia;
import fabricas.fabricaPalas;

public class gymGest {
	
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
