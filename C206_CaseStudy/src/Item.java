
public class Item {
	private String id;
	private String name;
	private double price;
	private Boolean isAvailable;
	
	public Item(String id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
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

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
