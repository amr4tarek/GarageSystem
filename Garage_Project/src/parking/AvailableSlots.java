package parking;

import java.util.ArrayList;
import java.util.LinkedList;

public class AvailableSlots {
	ArrayList<ParkingSlot> slots ;  
	AvailableSlots(ArrayList<ParkingSlot> slots )
	{
		this.slots=slots;
		
	}
	public void DisplaySlots() {
		int count = 0;
		for(int i=0;i<slots.size();i++) {
			if(slots.get(i).getAvaiable()==0) {
				System.out.println("avaiable slots is slots with id :" + slots.get(i).Slotid);
			}
			else if(slots.get(i).getAvaiable()==1) {
				count=count+1;
			}
		}
		if (slots.size()==count){
			System.out.println("no slots avaiable");
		}
	}
	
}
