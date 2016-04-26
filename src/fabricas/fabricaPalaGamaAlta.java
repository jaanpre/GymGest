package fabricas;

import gymGest.PalaGamaAlta;
import interfaces.PalaPadel;
import interfaces.PalaDePadel;

public class fabricaPalaGamaAlta implements PalaDePadel {
	
	@Override
	public PalaPadel crearPala() {
		PalaGamaAlta pga = new PalaGamaAlta();
		pga.generarCodigo();
		return pga;
	}
}
