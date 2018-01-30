//Siddharth Ghatti
//sg4ff@virginia.edu
package Venueresources;

import static org.junit.Assert.*;

import org.junit.Test;

public class VenueTest {

	@Test
	public void FindBestSeatTest()
	{
		Venue Venuefortest = new Venue();
		Venuefortest.populateTheater();
		Venuefortest.findBestSeat();
		Venuefortest.hashSeating();
		assertEquals(39,Venuefortest.findBestSeat()); //The beast is the 39th seat as it is in the middle 
		Venuefortest.getSeating()[3][5].reserveSeat(Venuefortest);
		assertEquals(28,Venuefortest.findBestSeat()); //Should return 28, calculated by hand 
	}
	
	@Test
	public void CancelReservationTest()
	{
		Venue Venuefortest = new Venue();
		Venuefortest.populateTheater();
		Venuefortest.hashSeating();
		Venuefortest.getSeating()[3][5].reserveSeat(Venuefortest);
		assertEquals(54,Venuefortest.getNumberOfSeats());
		assertTrue(Venuefortest.getSeating()[3][5].getReserved());	
		Venuefortest.cancelReservation();
		assertFalse(Venuefortest.getSeating()[3][5].getReserved()); //Choose the 39th seat for cancelling reservations
	}
	
	@Test
	public void ReserveSeatTest()
	{
		Venue VenueforReservationTest = new Venue();
		VenueforReservationTest.populateTheater();
		VenueforReservationTest.hashSeating();
		VenueforReservationTest.reserveSeat(); //Will be choosing the first seat here 
		assertEquals(54,VenueforReservationTest.getNumberOfSeats());
		assertTrue(VenueforReservationTest.getSeating()[0][0].getReserved()); //Choose the first seat for making reservations
	}

}
