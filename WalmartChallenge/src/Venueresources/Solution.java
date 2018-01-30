//Siddharth Ghatti
//sg4ff@virginia.edu
package Venueresources;


import java.util.Scanner;


public class Solution 
{
	
	
	public static void main(String args[])
	{
		
		Venue solutionVenue = new Venue();
		solutionVenue.populateTheater(); //Venue objects that will be used for the main method 
		solutionVenue.hashSeating();
		while(true) //While true loop, that will only be broken out of when the exit option is choosen 
		{
			Scanner reader = new Scanner(System.in); //Set up the main screen for the ticket service 
			System.out.println();
			solutionVenue.printTheater();
			System.out.println();
			solutionVenue.findBestSeat();
			System.out.println();
			System.out.println("Above are all the seats available, our reccomended seat is  "+solutionVenue.findBestSeat());
			System.out.println();
			System.out.println("There are "+solutionVenue.getNumberOfSeats() + " Seats available in the venue");
			System.out.println();
			System.out.println("Welcome to the Ticket Service, what would you like to do today?");
			System.out.println("a) Reserve a seat in the venue");
			System.out.println("b) Cancel a reservation");
			System.out.println("c) Exit the system");
			System.out.println("");
			switch(reader.next()) //Switch statement with each option. Each case calls the respective functions from venue class
			{
			case "a":
				solutionVenue.introScreen();
				solutionVenue.reserveSeat();
				break;
			case "b":
				solutionVenue.introScreen();
				solutionVenue.cancelReservation();
				break;
			case "c":
				System.out.println("Thank you for using the ticketing service. Goodbye. ");
				reader.close();//Did not close  Scanners in Venue class, as all of them are running on the same channel (System.in)
				System.exit(0);
				break; 
			default:
				System.out.println("Please enter a valid choice");	//Fail safe, if the user does not type in correct response
				break;	
			}
			
		}
		
		
		
		
		
			}
	


}
