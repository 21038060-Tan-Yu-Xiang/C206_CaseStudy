
public class Buyer {
	private String id;
	private String name;
	private int phoneNo;
	
	public Buyer(String id, String name, int phoneNo) {
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
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

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
}
