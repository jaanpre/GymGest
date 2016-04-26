package fabricas;

import interfaces.PalaDePadel;
import interfaces.PalaPadel;

public class fabricaPalas {
	
	public static PalaPadel crearFabricaPalas(PalaDePadel factory){
		
		PalaPadel objetoPala = factory.crearPala();
		objetoPala.codigoDePala();
		return objetoPala;
		
		// Cambio: era void, he añadido que devuelva un objeto PalaPadel
	
	}

}
