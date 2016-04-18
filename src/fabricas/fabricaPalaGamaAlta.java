package fabricas;

import gymGest.palaGamaAlta;
import interfaces.palaDePadel;
import interfaces.palaPadel;

public class fabricaPalaGamaAlta implements palaDePadel{
	
	@Override
	public palaPadel crearPala() {
		palaGamaAlta pga = new palaGamaAlta();
		pga.generarCodigo();
		return pga;
	}
}
