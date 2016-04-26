package fabricas;

import gymGest.PalaGamaMedia;
import interfaces.PalaPadel;
import interfaces.PalaDePadel;

public class fabricaPalaGamaMedia implements PalaDePadel {

	@Override
	public PalaPadel crearPala() {
		PalaGamaMedia pgm = new PalaGamaMedia();
		pgm.generarCodigo();
		return pgm;
}
}