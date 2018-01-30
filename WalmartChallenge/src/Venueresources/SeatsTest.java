//Siddharth Ghatti
//sg4ff@virginia.edu
package Venueresources;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeatsTest  //J Unit Tests for the major methods of the Seat Class 
{
	@Test
	public void seatCalculateScoreTest()
	{
		Seats testSeat = new Seats(false,3,5,1);
		testSeat.calculateScore();
		boolean Equality = false;
		if(testSeat.getSeatScore()==0.0)
		{
			Equality=true;
		}
		assertTrue(Equality); //Should be 0.0, as 39 is the beast seat, and distance from 39th seat to 39th seat = 0
		
	}
	
	@Test
	public void seatReserveSeatTest() //Reserving seat test method for the seat class 
	{
		Seats testSeat = new Seats(false, 1,1,4);
		Venue testVenue = new Venue();
		testSeat.reserveSeat(testVenue);
		assertTrue(testSeat.getReserved());
		assertEquals(54,testVenue.getNumberOfSeats());
		
	}
	@Test
	public void seatUnReserveSeatTest() //Seat unreserve method test
	{
		Seats testSeat = new Seats(false,2,4,5);
		Venue testVenue = new Venue();
		testSeat.reserveSeat(testVenue);
		testSeat.unReserveSeat(testVenue);
		assertFalse(testSeat.getReserved());
		assertEquals(55,testVenue.getNumberOfSeats());
		
	}

	

}
