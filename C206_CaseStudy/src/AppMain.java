import java.util.ArrayList;

public class AppMain {
	public static void main(String[] args) {
		
		//Initialize
		ArrayList<Bike> bikeList = new ArrayList<Bike>();
		ArrayList<BikePart> bikePartList = new ArrayList<BikePart>();
		
		//Sample Data
		bikeList.add(new Bike("B001", "eXtreme Mountain Bike", 229.99, "Carbon Fiber"));
		bikeList.add(new Bike("B002", "SAVA Road Bike", 159.99, "Steel"));
		bikeList.add(new Bike("B003", "BMC Sports Trail Bike", 200.00, "Titanium"));
		bikeList.add(new Bike("B004", "Cannondale Leisure Bike", 129.99, "Aluminium"));
		
		bikePartList.add(new BikePart("P001", "Carbonite Lightweight Frame", 99.99, "Bike Frame"));
		bikePartList.add(new BikePart("P002", "Memory Foam Saddle", 159.99, "Seat Saddle"));
		bikePartList.add(new BikePart("P003", "'I love my bike' Bell", 200.00, "Bicycle Bell"));
		bikePartList.add(new BikePart("P004", "Tsunami Aluminium Frame", 129.99, "Bike Frame"));
	
		int option = 0;
		while (option != 5) {
			mainMenu();
			option = Helper.readInt("Enter an option > ");
			
			if (option == 1) { //View BOTH bikeList and bikePartList at the same time
				viewAllBikes(bikeList);
				viewAllBikeParts(bikePartList);
			}
			else if (option == 2) {
				setHeader("Choose item to add: ");
				System.out.println("1. Bike");
				System.out.println("2. Bike Part");
				int suboption = Helper.readInt("Enter option to select item type > ");
				
				if (suboption == 1) {
					//Add a bike
					Bike newBike = inputBike();
					addBike(bikeList, newBike);
					System.out.println("New bike sucessfully added.");
				}
				else if (suboption == 2) {
					//Add a bike part
					BikePart newBikePart = inputBikePart();
					addBikePart(bikePartList, newBikePart);
					System.out.println("New bike part sucessfully added.");
				}
				else {
					System.out.println("Invalid selection. Returning to main menu...");
				}
			}
			else if (option == 3)  {
				setHeader("Choose item to update: ");
				System.out.println("1. Bike");
				System.out.println("2. Bike Part");
				int suboption = Helper.readInt("Enter option to select item type > ");
				
				if (suboption == 1) {
					//Update a bike
					Bike newBike = inputBike();
					addBike(bikeList, newBike);
					System.out.println("New bike sucessfully added.");
				}
				else if (suboption == 2) {
					//Update a bike part
					BikePart newBikePart = inputBikePart();
					addBikePart(bikePartList, newBikePart);
					System.out.println("New bike part sucessfully added.");
				}
				else {
					System.out.println("Invalid selection. Returning to main menu...");
				}
			}
			else {
				System.out.println("Invalid selection. Returning to main menu...");
			}
		}
	}
	
	//======================= View items =========================
	public static void viewAllBikes(ArrayList<Bike> bikeList) {
		setHeader(">> BIKE LIST");
		String output = String.format("%-5s %-26s %-10s %-11s %s\n", "ID", " NAME", "PRICE", "AVAILABLE","FRAME MATERIAL");
		
		for (int i = 0; i < bikeList.size(); i++) {

			output += String.format("%-6s %-25s %-10s %-11s %s\n", bikeList.get(i).getId(),
					bikeList.get(i).getName(), bikeList.get(i).getPrice(),
					showAvailability(bikeList.get(i).getIsAvailable()),
					bikeList.get(i).getFrameMaterial());
		}
		System.out.println(output);
	}
	
	public static void viewAllBikeParts(ArrayList<BikePart> bikePartList) {
		setHeader(">> BIKE PART LIST");
		System.out.println("Not coded: Display all bike parts");
		//TODO
	}
	
	//======================= Add items ===========================
	public static Bike inputBike() {
		String id = Helper.readString("Enter id > ");
		String name = Helper.readString("Enter name > ");
		double price = Helper.readDouble("Enter price > ");
		String frameMaterial = Helper.readString("Enter frame material > ");

		Bike newBike= new Bike(id, name, price, frameMaterial);
		return newBike;
	}
	
	public static void addBike(ArrayList<Bike> bikeList, Bike newBike) {
		bikeList.add(newBike);
	}
	
	public static BikePart inputBikePart() {
		String id = Helper.readString("Enter id > ");
		String name = Helper.readString("Enter name > ");
		double price = Helper.readDouble("Enter price > ");
		String category = Helper.readString("Enter category > ");

		BikePart newBikePart= new BikePart(id, name, price, category);
		return newBikePart;
	}
	
	public static void addBikePart(ArrayList<BikePart> bikePartList, BikePart newBikePart) {
		bikePartList.add(newBikePart);
	}
	
	//==================== Update items ===========================
	
	
	//================= Check availability ========================
	public static String showAvailability(boolean isAvailable) {
		String avail;

		if (isAvailable == true) {
			avail = "Yes";
		} else {
			avail = "No";
		}
		return avail;
	}
	
	//================= User interface methods ====================
	private static void mainMenu() {
		Helper.line(80, "-");
		System.out.println("BIKER'S PORTAL");
		Helper.line(80, "-");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Update item");
		System.out.println("4. ?");
		System.out.println("5. Quit");
		Helper.line(80, "-");
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
}
