package fabricas;

import gymGest.PalaNinyo;
import interfaces.PalaDePadel;
import interfaces.PalaPadel;

public class fabricaPalaNinyo implements PalaDePadel {
	
	@Override
	public PalaPadel crearPala() {
		PalaNinyo pn = new PalaNinyo();
		pn.generarCodigo();
		return pn;
	}	

}
