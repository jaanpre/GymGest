package fabricas;

import gymGest.PalaGamaAlta;
import interfaces.palaDePadel;
import interfaces.palaPadel;

public class fabricaPalaGamaAlta implements palaDePadel{
	
	@Override
	public palaPadel crearPala() {
		PalaGamaAlta pga = new PalaGamaAlta();
		pga.generarCodigo();
		return pga;
	}
}
