package fabricas;

import gymGest.PalaGamaBaja;
import interfaces.PalaPadel;
import interfaces.PalaDePadel;

public class fabricaPalaGamaBaja implements PalaDePadel {

	@Override
	public PalaPadel crearPala() {
		PalaGamaBaja pgm = new PalaGamaBaja();
		pgm.generarCodigo();
		return pgm;
	}	

}
