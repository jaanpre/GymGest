package fabricas;

import interfaces.palaDePadel;
import interfaces.palaPadel;

public class fabricaPalas {
	
	public static void crearFabricaPalas(palaDePadel factory){
		
		palaPadel objetoPala = factory.crearPala();
		objetoPala.codigoDePala();
	
	}

}
