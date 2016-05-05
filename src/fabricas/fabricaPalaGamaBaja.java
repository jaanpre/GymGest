package fabricas;

import gymGest.PalaGamaBaja;
import interfaces.palaDePadel;
import interfaces.palaPadel;

public class fabricaPalaGamaBaja implements palaDePadel{

	@Override
	public palaPadel crearPala() {
		PalaGamaBaja pgm = new PalaGamaBaja();
		pgm.generarCodigo();
		return pgm;
	}	

}
