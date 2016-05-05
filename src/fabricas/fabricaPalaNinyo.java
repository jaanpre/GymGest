package fabricas;


import gymGest.PalaGamaAlta;
import gymGest.PalaNinyo;
import interfaces.palaDePadel;
import interfaces.palaPadel;

public class fabricaPalaNinyo implements palaDePadel{
	
	@Override
	public palaPadel crearPala() {
		PalaNinyo pn = new PalaNinyo();
		pn.generarCodigo();
		return pn;
	}	

}
