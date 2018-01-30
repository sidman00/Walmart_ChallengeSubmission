//Siddharth Ghatti
//sg4ff@virginia.edu
package Venueresources;
//Runnable that will be used for the temporarily hold. Will be implemented by a thread
public class seatHolder implements Runnable 
{



	private volatile boolean exit = false;

public void run()
{
	while(!exit)
	{
		long startReferencePoint = System.currentTimeMillis();
		long endofHold = startReferencePoint+(30*1000);
		while(System.currentTimeMillis()<endofHold)
		{
			
			
		}
		System.out.println("UPDATE ON HOLD: Your Hold has been terminated");
		
	}
	
}
public void stop() //Need stop mechanism in order to stop the thread when user confirms reservation or exits from screen 
{
	exit=true;
}



	
	
}


