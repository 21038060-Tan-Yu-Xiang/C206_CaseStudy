import java.util.ArrayList;

public class AppMain {
	
	//Initialize
	ArrayList<Bike> bikeList = new ArrayList<Bike>();
	ArrayList<BikePart> bikePartList = new ArrayList<BikePart>();
	
	public static void main(String[] args) {
		
		AppMain am = new AppMain();
		am.start();
	}
	
	private void start( ) {
		mainMenu();
	}
	
	private void mainMenu() {
		Helper.line(80, "-");
		System.out.println("BIKER'S PORTAL");
		Helper.line(80, "-");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Loan item");
		System.out.println("4. Return item");
		System.out.println("5. Quit");
		Helper.line(80, "-");
	}
}
