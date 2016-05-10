package fabricas;

import interfaces.palaDePadel;
import interfaces.palaPadel;

public class fabricaPalas {

// Llama a la fábrica y le pide que cree la pala
// Podría directamente crear la fábrica, y a esa fábrica...pedirle el objeto...

	public static palaPadel crearFabricaPalas(palaDePadel factory){
		
		palaPadel objetoPala = factory.crearPala();
		objetoPala.codigoDePala();
		return objetoPala;
		
		// Cambio: era void, he añadido que devuelva un objeto palaPadel
	
	}

}
