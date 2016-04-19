package fabricas;

import gymGest.palaNinyo;
import interfaces.palaDePadel;
import interfaces.palaPadel;

public class fabricaPalaNinyo implements palaDePadel{
	
	@Override
	public palaPadel crearPala() {
		palaNinyo pn = new palaNinyo();
		pn.generarCodigo();
		return pn;
	}	

}
