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
			
			if (option == 1) { //Manage Inventory
				setHeader("Manage Inventory");
				System.out.println("1. View Inventory");
				System.out.println("2. Add Item");
				System.out.println("3. Update Item Information");
				System.out.println("4. Delete Item");
				int suboption = Helper.readInt("Enter an option > ");
				
				if (suboption == 1) {
					//View BOTH bikeList and bikePartList at the same time
					viewAllBikes(bikeList);
					viewAllBikeParts(bikePartList);
				}
				else if (suboption == 2) {
					int itemoption = itemSelect();
					
					if (itemoption == 1) {
						//Add a bike
						Bike newBike = inputBike();
						addBike(bikeList, newBike);
						System.out.println("New bike sucessfully added.");
					}
					else if (itemoption == 2) {
						//Add a bike part
						BikePart newBikePart = inputBikePart();
						addBikePart(bikePartList, newBikePart);
						System.out.println("New bike part sucessfully added.");
					}
					else {
						System.out.println("Invalid selection. Returning to main menu...");
					}
				}
				else if (suboption == 3) {
					int itemoption = itemSelect();
					
					if (itemoption == 1) {
						//Update a bike
						viewAllBikes(bikeList);
						String id = Helper.readString("Enter id to update > ");
						System.out.println("## Not Coded ##");
						//TODO: Extra*: Check if id entered exists before updating
					}
					else if (itemoption == 2) {
						//Update a bike part
						viewAllBikeParts(bikePartList);
						String id = Helper.readString("Enter id to update > ");
						System.out.println("## Not Coded ##");
						//TODO: Extra*: Check if id entered exists before updating
					}
					else {
						System.out.println("Invalid selection. Returning to main menu...");
					}
				}
				else if (suboption == 4) {
					int itemoption = itemSelect();

					if (itemoption == 1) {
						// Update a bike
						viewAllBikes(bikeList);
						String id = Helper.readString("Enter id to delete > ");
						System.out.println("## Not Coded ##");
						// TODO: Extra*: Check if id entered exists in the ArrayList before deleting
					} else if (itemoption == 2) {
						// Update a bike part
						viewAllBikeParts(bikePartList);
						String id = Helper.readString("Enter id to delete > ");
						System.out.println("## Not Coded ##");
						// TODO: Extra*: Check if id entered exists in the ArrayList before deleting
					}
				}
				else {
					System.out.println("Invalid selection. Returning to main menu...");
				}
			}
			else if (option == 2) { //Manage Buyers
				setHeader("Manage Buyers");
				System.out.println("1. Register Buyer");
				System.out.println("2. Update Buyer Information");
				System.out.println("3. Search Buyer by Name");
				System.out.println("4. Search Buyer by Phone No");
				int suboption = Helper.readInt("Enter an option > ");
				
				if (suboption == 1) {
					System.out.println("## Not Coded ##");
					//TODO
				}
				else if (suboption == 2) {
					System.out.println("## Not Coded ##");
					//TODO
				}
				else if (suboption == 3) {
					System.out.println("## Not Coded ##");
					//TODO
				}
				else if (suboption == 4) {
					System.out.println("## Not Coded ##");
					//TODO
				}
				else {
					System.out.println("Invalid selection. Returning to main menu...");
				}
			}
			else if (option == 3)  { //Manage Appointments
				setHeader("Manage Appointments");
				System.out.println("1. Create Appointment");
				System.out.println("2. View Appointments");
				System.out.println("3. Update Appointment Information");
				System.out.println("4. Delete Appointment");
				System.out.println("5. Search Appointment by Date");
				System.out.println("6. Search Appointment by Buyer's Name");
				int suboption = Helper.readInt("Enter an option > ");
				
				if (suboption == 1) {
					System.out.println("## Not Coded ##");
					//TODO
				}
				else if (suboption == 2) {
					System.out.println("## Not Coded ##");
					//TODO
				}
				else if (suboption == 3) {
					System.out.println("## Not Coded ##");
					//TODO
				}
				else if (suboption == 4) {
					System.out.println("## Not Coded ##");
					//TODO
				}
				else if (suboption == 5) {
					System.out.println("## Not Coded ##");
					//TODO
				}
				else if (suboption == 6) {
					System.out.println("## Not Coded ##");
					//TODO
				}
				else {
					System.out.println("Invalid selection. Returning to main menu...");
				}
			}
			else if (option == 4) { //Manage Feedback
				setHeader("Manage Feedback");
				System.out.println("1. Record Feedback");
				System.out.println("2. View Feedback");
				System.out.println("3. Respond to Feedback");
				System.out.println("4. Update Feedback Status");
				System.out.println("5. Delete Feedback");
				int suboption = Helper.readInt("Enter an option > ");
				
				if (suboption == 1) {
					System.out.println("## Not Coded ##");
					//TODO
				}
				else if (suboption == 2) {
					System.out.println("## Not Coded ##");
					//TODO
				}
				else if (suboption == 3) {
					System.out.println("## Not Coded ##");
					//TODO
				}
				else if (suboption == 4) {
					System.out.println("## Not Coded ##");
					//TODO
				}
				else if (suboption == 5) {
					System.out.println("## Not Coded ##");
					//TODO
				}
				else {
					System.out.println("Invalid selection. Returning to main menu...");
				}
			}
			else if (option == 5) { //Quit
				System.out.println("Thank you for using Biker's Portal.");
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
		String output = String.format("%-5s %-30s %-10s %-11s %s\n", "ID", " NAME", "PRICE", "AVAILABLE",
				"CATEGORY");

		for (int i = 0; i < bikePartList.size(); i++) {

			output += String.format("%-6s %-29s %-10s %-11s %s\n", bikePartList.get(i).getId(), bikePartList.get(i).getName(),
					bikePartList.get(i).getPrice(), showAvailability(bikePartList.get(i).getIsAvailable()),
					bikePartList.get(i).getCategory());
		}
		System.out.println(output);
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
		System.out.println("1. Manage Inventory");
		System.out.println("2. Manage Buyers");
		System.out.println("3. Manage Appointments");
		System.out.println("4. Manage Feedback");
		System.out.println("5. Quit");
		Helper.line(80, "-");
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	public static int itemSelect() {
		setHeader("Choose item: ");
		System.out.println("1. Bike");
		System.out.println("2. Bike Part");
		int itemoption = Helper.readInt("Enter option to select item type > ");
		return itemoption;
	}
}
