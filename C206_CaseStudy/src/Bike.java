
public class Bike extends Item {
private String frameMaterial;

	public Bike(String id, String name, double price, String frameMaterial) {
		super(id, name, price);
		this.frameMaterial = frameMaterial;
	}

	public String getFrameMaterial() {
		return frameMaterial;
	}

	public void setFrameMaterial(String frameMaterial) {
		this.frameMaterial = frameMaterial;
	}
}
