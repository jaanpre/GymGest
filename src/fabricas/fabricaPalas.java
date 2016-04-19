package fabricas;

import interfaces.palaDePadel;
import interfaces.palaPadel;

public class fabricaPalas {
	
	public static palaPadel crearFabricaPalas(palaDePadel factory){
		
		palaPadel objetoPala = factory.crearPala();
		objetoPala.codigoDePala();
		return objetoPala;
		
		// Cambio: era void, he añadido que devuelva un objeto palaPadel
	
	}

}
