//Siddharth Ghatti
//sg4ff@virginia.edu
package Venueresources;

public class Seats 
{
	private boolean reserved; //Field variables
	private int seatxposition; //X position of seat
	private int seatyposition;//Y seat of position
	private int seatid;//Seat id based on location in theater. Mainly used to distinguish seats 
	private double seatscore; //Seat score based on distance from center
	
	public int getSeatId() 
	{
		return this.seatid;
	}
	public void setSeatid(int seatid) {
		this.seatid = seatid;
	}
	Seats(boolean reservedstatus,int xposition,int yposition, int newseatid) //Default Constructor 
	{
		seatid = newseatid;
		reserved=reservedstatus;
		seatxposition=xposition;
		seatyposition=yposition;	
	}
	public  void calculateScore() //Calculates "seating" score for each seat based on distance from center seat 
	{
		double distance = Math.hypot((double)this.seatxposition-3,(double)this.seatyposition-5);
		this.seatscore=distance;
	}
	public boolean getReserved() //Getters  and setters for this class 
	{
		return this.reserved;
	}
	public int getXPosition()
	{
		return this.seatxposition;
	}
	public int getYPosition()
	{
		return this.seatyposition;
	}
	public double getSeatScore() 
	{
		// TODO Auto-generated method stub
		return this.seatscore;
	}
	//Setters
	public void setReserved(boolean newreservation)
	{
		this.reserved= newreservation;
	}
	public void setXPosition(int newxposition)
	{
		this.seatxposition= newxposition;
	}
	public void setYPosition(int newyposition)
	{
		this.seatyposition=newyposition; 	
	}
	public void setSeatId(int x)
	{
		this.seatid = x;
	}
	
	public boolean reserveSeat(Venue venueForSeats) //Function to book a seat in the theater, returns true if reservation is a success
	{
		if(this.reserved==false) //Checks to make sure seat is not already reserved
		{
			this.setReserved(true);
			venueForSeats.setNumberofseats(venueForSeats.getNumberOfSeats()-1); //Decreases number of available seats by 1
			return true;
		}
		else
		{
			System.out.println("The seat is not currently available");
			return false;
		}
	}
	
	public boolean unReserveSeat(Venue venueForSeats) //Cancels a reservation
	{
		if(this.reserved==true) //Checks to make sure seat is already reserved and cancels reservation.
		{
			this.setReserved(false);
			venueForSeats.setNumberofseats(venueForSeats.getNumberOfSeats()+1); //Increases number of available seats by 1
			return true;
		}
		else
		{
			System.out.println("Seat is already not reserved ");
			return false;
		}
	}

	
	

}