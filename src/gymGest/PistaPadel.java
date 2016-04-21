package gymGest;

public class PistaPadel extends Instalacion {

	private String material;

	public PistaPadel(String nombre, List<Monitor> monitoresInstalacion, double precioAlquiler, String material){
		super(nombre, monitoresInstalacion, precioAlquiler);
		this.material=material;
	}

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
}
