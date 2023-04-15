package parking;

import java.util.ArrayList;
import java.util.LinkedList;

public class Park {

	ArrayList<ParkingSlot> slots ;  
	LinkedList <Vehicle> veh ;
	Park(ArrayList<ParkingSlot> slots ,LinkedList <Vehicle> veh)
	{
		this.slots=slots;
		this.veh=veh;
	}

	public void displaytime() {
	    java.util.Date date = new java.util.Date();    
	    System.out.println(date);  
	};
}
