package fabricas;

import gymGest.palaGamaBaja;
import interfaces.palaDePadel;
import interfaces.palaPadel;

public class fabricaPalaGamaBaja implements palaDePadel{

	@Override
	public palaPadel crearPala() {
		palaGamaBaja pgm = new palaGamaBaja();
		pgm.generarCodigo();
		return pgm;
	}	

}
