
public class BikePart extends Item {
private String category;

	public BikePart(String id, String name, double price, String category) {
		super(id, name, price);
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
