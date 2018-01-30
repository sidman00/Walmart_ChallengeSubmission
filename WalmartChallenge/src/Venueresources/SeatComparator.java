//Comparator for the Seats class, this is used to determine which seats are 'better' for the customer based on the score 
//Siddharth Ghatti
//sg4ff@virginia.ed
package Venueresources;
import java.util.Comparator;
public class SeatComparator implements Comparator<Seats> 
{
	@Override
	public int compare(Seats a, Seats b)
	{
		if(a!=null && b!=null)
		{
			if(a.getSeatScore() < b.getSeatScore())
			{
				return -1;
			}
			if(a.getSeatScore() > b.getSeatScore())
			{
				return 1;
			}
			return 0; 
			
		}
		return 0; 
		
	}

}
