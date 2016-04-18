package fabricas;

import gymGest.palaGamaMedia;
import interfaces.palaDePadel;
import interfaces.palaPadel;

public class fabricaPalaGamaMedia implements palaDePadel {

	@Override
	public palaPadel crearPala() {
		palaGamaMedia pgm = new palaGamaMedia();
		pgm.generarCodigo();
		return pgm;
}
}