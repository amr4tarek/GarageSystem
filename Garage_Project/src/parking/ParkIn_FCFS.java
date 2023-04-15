package parking;

import java.util.ArrayList;
import java.util.LinkedList;

public class ParkIn_FCFS extends Park {
	ParkIn_FCFS(ArrayList<ParkingSlot> slots, LinkedList<Vehicle> veh) {
		super(slots, veh);
		// TODO Auto-generated constructor stub
	}


	
	public void FirstCame() {
		int min = 0;	
		

		for(int i=0;i<slots.size();i++)
		{
			if(slots.get(i).getAvaiable()==1) 
				
			{
		        continue;
			}
			
			if(slots.get(i).depth>= veh.getLast().depth&&slots.get(i).width>= veh.getLast().width)
			{
				min =i;
				System.out.println("Vehicle park in slot number " + (min+1)+ " with id "+slots.get(min).Slotid);
				slots.get(min).SetAvaiable(1);
				slots.get(min).SetVehid(veh.getLast().ID);

				break;
			}
			

			
		}
		long s =System.currentTimeMillis();
	    veh.getLast().SetStart(s);
 

	}
}
