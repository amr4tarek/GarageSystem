package parking;

import java.util.ArrayList;
import java.util.LinkedList;


public class ParkIn_BestFit extends Park {
	ParkIn_BestFit(ArrayList<ParkingSlot> slots, LinkedList<Vehicle> veh) {
		super(slots, veh);
		// TODO Auto-generated constructor stub
	}


	
	public void BestFit() {
		int min = 0;	
		//int count=0;
		for(int i=1;i<slots.size();i++)
		{
			if(slots.get(min).getAvaiable()==1) {
				min =i;
				continue;
			}
			if(slots.get(i).getAvaiable()==1) 
			{
				//count =count+1;

		        continue;
			}
			
			else if(slots.get(min).depth>= slots.get(i).depth && 
						slots.get(min).depth>= veh.getLast().depth &&
						slots.get(i).depth>=veh.getLast().depth  )
				{
					
					if(slots.get(min).width>= slots.get(i).width && 
							slots.get(min).width>= veh.getLast().width &&
							slots.get(i).width>=veh.getLast().width
							) 
					{
						min =i;
						
					}
					else if(slots.get(min).width<= slots.get(i).width && 
							slots.get(i).width>=veh.getLast().width) 
					{
						min =i;
					}
					//count =count+1;

					
				}
				else 
				{
					if(slots.get(min).depth < veh.getLast().depth || slots.get(min).width < veh.getLast().width)
					{
						min =i ;
					}
					if(slots.get(min).getAvaiable()==1) {
						min =i;
					}
					
					//count =count+1;
				}
			
			
		}
		
		slots.get(min).SetAvaiable(1);
		slots.get(min).SetVehid(veh.getLast().ID);
		System.out.println("Vehicle park in slot number " + (min+1) + " with id "+slots.get(min).Slotid);
		long s =System.currentTimeMillis();
	    veh.getLast().SetStart(s);
 
	    
	}


}
