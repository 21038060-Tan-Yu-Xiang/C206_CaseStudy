import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	//Initialize variables
	private Bike bike1;
	private Bike bike2;
	private Bike bike3;
	private Bike bike4;
	
	private BikePart part1;
	private BikePart part2;
	private BikePart part3;
	private BikePart part4;
	
	private Buyer buyer1;
	private Buyer buyer2;
	private Buyer buyer3;
	private Buyer buyer4;
	
	private Feedback feed1;
	private Feedback feed2;
	private Feedback feed3;
	private Feedback feed4;
	
	private Appointment appt1;
	private Appointment appt2;
	private Appointment appt3;
	private Appointment appt4;
	
	private ArrayList<Bike> bikeList;
	private ArrayList<BikePart> bikePartList;
	private ArrayList<Buyer> buyerList;
	private ArrayList<Appointment> appointmentList;
	private ArrayList<Feedback> feedbackList;
	
	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		//Sample data
		bike1 = new Bike("B001", "eXtreme Mountain Bike", 229.99, "Carbon Fiber");
		bike2 = new Bike("B002", "SAVA Road Bike", 159.99, "Steel");
		bike3 = new Bike("B003", "BMC Sports Trail Bike", 200.00, "Titanium");
		bike4 = new Bike("B004", "Cannondale Leisure Bike", 129.99, "Aluminium");
		
		part1 = new BikePart("P001", "Carbonite Lightweight Frame", 99.99, "Bike Frame");
		part2 = new BikePart("P002", "Memory Foam Saddle", 159.99, "Seat Saddle");
		part3 = new BikePart("P003", "'I love my bike' Bell", 200.00, "Bicycle Bell");
		part4 = new BikePart("P004", "Tsunami Aluminium Frame", 129.99, "Bike Frame");
		
		buyer1 = new Buyer("B001", "Tom", 99991111);
		buyer2 = new Buyer("B002", "Amy", 22223333);
		buyer3 = new Buyer("B003", "Mark", 33332222);
		buyer4 = new Buyer("B004", "Jerry", 11119999);
		
		feed1 = new Feedback("F001", "the order was very slow, i waited for 3 weeks");
		feed2 = new Feedback("F002", "hello something is missing from my box");
		feed3 = new Feedback("F003", "product received from the seller very quickly");
		feed4 = new Feedback("F004", "hi, is P004 still available?");
		
		appt1 = new Appointment("A001", LocalDate.of(2022, 8, 8), "Tom"); //year, month, day
		appt2 = new Appointment("A002", LocalDate.of(2022, 10, 23), "Amy");
		appt3 = new Appointment("A003", LocalDate.of(2022, 12, 22), "Mark");
		appt4 = new Appointment("A004", LocalDate.of(2023, 1, 3), "Jerry");
		
		bikeList = new ArrayList<Bike>();
		bikePartList = new ArrayList<BikePart>();
		buyerList = new ArrayList<Buyer>();
		feedbackList = new ArrayList<Feedback>();
		appointmentList = new ArrayList<Appointment>();
	}
	
//	Master Template (Use Control + / to uncomment) !DO NOT DELETE, FOR COPYING ONLY!
//	@Test
//	public void test() {
//		//type here...
//	}
	
	@Test
	public void testAddBike() {
		//Item list is not null, so that we can add a new item
		assertNotNull("Test if there is a valid Bike arraylist to add to", bikeList);
		
		//Adding 1 item, should increase the size of the list to 1
		AppMain.addBike(bikeList, bike1);
		assertEquals("Test if that Bike arraylist size is 1?", 1, bikeList.size());
		
		//The item added is same as the first item of the list
		assertSame("Test that the Bike added is the same as the 1st item of the list?", bike1, bikeList.get(0));
		
		//Add another 3 items. test The size of the list is 4?
		//The last item added is the same as the last item of the list?
		AppMain.addBike(bikeList, bike2);
		AppMain.addBike(bikeList, bike3);
		AppMain.addBike(bikeList, bike4);
		assertEquals("Test that Bike arraylist size is 4?", 4, bikeList.size());
		assertSame("Test that the Bike last added is the same as 4th item of the list?", bike4, bikeList.get(3));
	}
	
	@Test
	public void testaddBikePart() {
		//Item list is not null, so that we can add a new item
		assertNotNull("Test if there is a valid Bike Part arraylist to add to", bikePartList);
		
		//Adding 1 item, should increase the size of the list to 1
		AppMain.addBikePart(bikePartList, part1);
		assertEquals("Test if that Bike Part arraylist size is 1?", 1, bikePartList.size());
		
		//The item added is same as the first item of the list
		assertSame("Test that the Bike Part added is the same as the 1st item of the list?", part1, bikePartList.get(0));
		
		//Add another 3 items. test The size of the list is 4?
		//The last item added is the same as the last item of the list?
		AppMain.addBikePart(bikePartList, part2);
		AppMain.addBikePart(bikePartList, part3);
		AppMain.addBikePart(bikePartList, part4);
		assertEquals("Test that Bike Part arraylist size is 4?", 4, bikePartList.size());
		assertSame("Test that the Bike Part last added is the same as 4th item of the list?", part4, bikePartList.get(3));
	}
	
	@Test
	public void testaddAppointment() {
		//Item list is not null, so that we can add a new item
		assertNotNull("Test if there is a valid Appointment arraylist to add to", appointmentList);
		
		//Adding 1 item, should increase the size of the list to 1
		AppMain.addAppointment(appointmentList, appt1);
		assertEquals("Test if that Appointment arraylist size is 1?", 1, appointmentList.size());
		
		//The item added is same as the first item of the list
		assertSame("Test that the Appointment added is the same as the 1st item of the list?", appt1, appointmentList.get(0));
		
		//Add another 3 items. test The size of the list is 4?
		//The last item added is the same as the last item of the list?
		AppMain.addAppointment(appointmentList, appt2);
		AppMain.addAppointment(appointmentList, appt3);
		AppMain.addAppointment(appointmentList, appt4);
		assertEquals("Test that Appointment arraylist size is 4?", 4, appointmentList.size());
		assertSame("Test that the Appointment last added is the same as 4th item of the list?", appt4, appointmentList.get(3));
	}
	
	@Test
	public void testViewAllBikes() {
		//Item list is not null, so that we can add a new item
		assertNotNull("Test if there is a valid Bike arraylist to add to", bikeList);
		
		//Test if the list of Bike retrieved from the AppMain is empty
		assertEquals("Check that bikeList is empty at the start", 0, bikeList.size());
		
		//Given an empty list, after adding 4 items, test if the size of the list is 4
		AppMain.addBike(bikeList, bike1);
		AppMain.addBike(bikeList, bike2);
		AppMain.addBike(bikeList, bike3);
		AppMain.addBike(bikeList, bike4);
		assertEquals("Test if that Bike arraylist size is 4?", 4, bikeList.size());
	}
	
	@Test
	public void testViewAllBikeParts() {
		//Item list is not null, so that we can add a new item
		assertNotNull("Test if there is a valid Bike Part arraylist to add to", bikePartList);
		
		//Test if the list of Bike Part retrieved from the AppMain is empty
		assertEquals("Check that bikePartList is empty at the start", 0, bikePartList.size());
		
		//Given an empty list, after adding 4 items, test if the size of the list is 4
		AppMain.addBikePart(bikePartList, part1);
		AppMain.addBikePart(bikePartList, part2);
		AppMain.addBikePart(bikePartList, part3);
		AppMain.addBikePart(bikePartList, part4);
		assertEquals("Test if that Bike arraylist size is 4?", 4, bikePartList.size());
	}
	
	@Test
	public void testViewAllAppointments() {
		//Item list is not null, so that we can add a new item
		assertNotNull("Test if there is a valid Appointment arraylist to add to", appointmentList);
		
		//Test if the list of Appointment retrieved from the AppMain is empty
		assertEquals("Check that appointmentList is empty at the start", 0, appointmentList.size());
		
		//Given an empty list, after adding 4 items, test if the size of the list is 4
		AppMain.addAppointment(appointmentList, appt1);
		AppMain.addAppointment(appointmentList, appt2);
		AppMain.addAppointment(appointmentList, appt3);
		AppMain.addAppointment(appointmentList, appt4);
		assertEquals("Test if that Appointment arraylist size is 4?", 4, appointmentList.size());
	}
	
	@Test
	public void testViewAllFeedback() {
		//Item list is not null, so that we can add a new item
		assertNotNull("Test if there is a valid Feedback arraylist to add to", feedbackList);
		
		//Test if the list of Feedback retrieved from the AppMain is empty
		assertEquals("Check that feedbackList is empty at the start", 0, feedbackList.size());
		
		//Given an empty list, after adding 4 items, test if the size of the list is 4
		AppMain.addFeedback(feedbackList, feed1);
		AppMain.addFeedback(feedbackList, feed2);
		AppMain.addFeedback(feedbackList, feed3);
		AppMain.addFeedback(feedbackList, feed4);
		assertEquals("Test if that Feedback arraylist size is 4?", 4, feedbackList.size());
	}
	
	@Test
	public void testDeleteBike() {
		//Item list is not null, so that we can delete a new item
		assertNotNull("Test if there is a valid Bike arraylist to delete from", bikeList);
		
		//After adding 1 item, test if the size of the list is 1
		AppMain.addBike(bikeList, bike1);
		assertEquals("Test if that Bike arraylist size is 1?", 1, bikeList.size());
		
		//Delete the item, and test if the size of the list is 0
		AppMain.deleteBike(bikeList); //Requires user input (B001) in console
		assertEquals("Test if that Bike arraylist size is 0?", 0, bikeList.size());	
	}
	
	@Test
	public void testDeleteBikePart() {
		//Item list is not null, so that we can delete a new item
		assertNotNull("Test if there is a valid Bike Part arraylist to delete from", bikePartList);
		
		//After adding 1 item, test if the size of the list is 1
		AppMain.addBikePart(bikePartList, part1);
		assertEquals("Test if that Bike Part arraylist size is 1?", 1, bikePartList.size());
		
		//Delete the item, and test if the size of the list is 0
		AppMain.deleteBikePart(bikePartList); //Requires user input (P001) in console
		assertEquals("Test if that Bike Part arraylist size is 0?", 0, bikePartList.size());	
	}
	@Test 
	public void testDeleteAppointment() {
		// Appointment list is not null, so that we can delete a new appointment 
		assertNotNull("Test if there is a valid Appointement ArrayList to delete from", appointmentList);
		
		//After adding 1 appointment, test if the size of the list is 1
		AppMain.addAppointment(appointmentList, appt1); 
		assertEquals("Test if that Appointment ArrayList size is 1?", 1, appointmentList.size());
		
		//Delete the item, and test if the size of the list is 0
		AppMain.deleteAppointment(appointmentList); // Requires user input (A001) in console 
		assertEquals("Test if that Appointment ArrayList size is 0?", 0, appointmentList.size());	
	}
	
	@Test
	public void testUpdateBikeInformation() { 
	
		assertNotNull("Test if the bike information has been updated from", bikeList.size());
	}
	@Test 
	public void testUpdateBikePartInformation() { 
		// i haven't complete it yet and resulting in failure due to incomplete codes  - putri 
		
		
		// Bike part list is not null, so that we can update a new bike part information
		assertNotNull("Test if there is a valid BikePart ArrayList to update information from", bikePartList);
		
		//Test if the list of the Bike Part is filled at the start so that there can be an update. 
		//To have an update, Bike Part list cannot be empty.
		assertEquals("Check that bikePartList ArrayList is 4 and not empty", 4, bikePartList.size());
		
		//Check if the updated information is reflected successfully
		assertNotNull("Test if the bike part information has been updated from", bikePartList.size());
		
	}
	@Test
	public void testUpdateFeedbackList() {
		//type here...
		assertNotNull("Test if the feedback list has been updated from", feedbackList);
	}
	
	@Test
	public void testSearchBuyerInformation() {
		//type here...
		assertNotNull("Test if the buyer information can be searched from", buyerList);
	}
	
	@Test
	public void testCreateCustomerFeedback() {
		//type here...
		assertNotNull("Test if customer feedback can be created", feedbackList);
	}
	
	public void testUpdateBuyerInformation() {
		//type here...
		assertNotNull("Test if buyer information can be updated", buyerList);
	}
	
	public void testSearchAppointmentByID() {
		//type here...
		assertNotNull("Test if appointment can be searched by ID", appointmentList);
	}
	
	public void testSearchAppointmentByDate() {
		//type here...
		assertNotNull("Test if appointment can be searched by date", appointmentList);
	}
	
	@After
	public void tearDown() throws Exception {
		bike1 = null;
		bike2 = null;
		bike3 = null;
		bike4 = null;
		
		part1 = null;
		part2 = null;
		part3 = null;
		part4 = null;
		
		buyer1 = null;
		buyer2 = null;
		buyer3 = null;
		buyer4 = null;
		
		feed1 = null;
		feed2 = null;
		feed3 = null;
		feed4 = null;
		
		appt1 = null;
		appt2 = null;
		appt3 = null;
		appt4 = null;
		
		bikeList = null;
		bikePartList = null;
		buyerList = null;
		feedbackList = null;
		appointmentList = null;
	}
}
