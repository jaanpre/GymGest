package fabricas;

import gymGest.PalaGamaMedia;
import interfaces.palaDePadel;
import interfaces.palaPadel;

public class fabricaPalaGamaMedia implements palaDePadel {

	@Override
	public palaPadel crearPala() {
		PalaGamaMedia pgm = new PalaGamaMedia();
		pgm.generarCodigo();
		return pgm;
}
}