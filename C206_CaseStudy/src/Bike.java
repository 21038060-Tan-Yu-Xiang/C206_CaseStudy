
public class Bike extends Item {
private String frame;
private String suspension;

	public Bike(String id, String name, double price, int qty, String frame, String suspension) {
		super(id, name, price, qty);
		this.frame = frame;
		this.suspension = suspension;
	}
}
