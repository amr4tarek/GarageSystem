package parking;

import java.util.LinkedList;

public class AvailableVeh {
	LinkedList <Vehicle> veh ;
	AvailableVeh(LinkedList <Vehicle> veh )
	{
		this.veh=veh;
		
	}
	
	public void DisplayList() {
		
		if(veh.size()==0) {
			System.out.println("No vehicle parking");
		}
		else {
			
			System.out.println("Vehicles in garage ");
			
			for(int i=0;i<(veh.size());i++) 
			{
				System.out.println("Vehicle with id :"+veh.get(i).ID);
			}
		}
		
	}
}
