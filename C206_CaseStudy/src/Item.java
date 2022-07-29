
public class Item {
	private String id;
	private String name;
	private double price;
	private int qty;
	private Boolean isAvailable;
	
	public Item(String id, String name, double price, int qty) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.isAvailable = true;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
