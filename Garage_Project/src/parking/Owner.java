package parking;

import java.util.ArrayList;
import java.util.Scanner;

public class Owner 
{
ArrayList<ParkingSlot> slots ;  
int config;

  Owner	(ArrayList<ParkingSlot> slots )
{
	this.slots=slots;
}
  public void Setup() {
		Scanner sc = new Scanner (System.in);
		 System.out.println("Owner setup for garage");
		 System.out.println("Enter number of slot in garage");
		 int siz = sc.nextInt();
		 do {
			 System.out.println("Enter slot configuration 1 for best fit and 2 for first came first ");
			 config = sc.nextInt();  
			 
		 }
		 while(config !=1 && config !=2 );
		 
		 for(int i = 0; i< siz ; i++)
		 {
			 System.out.println("Enter slot id for slot number "+(i+1));
			 int slotid = sc.nextInt();
			 System.out.println("Enter depth and width for slot number "+(i+1));
			 int dep = sc.nextInt();
			 int wid = sc.nextInt();
			 ParkingSlot s = new ParkingSlot(slotid,dep,wid);
			 s.SetAvaiable(0);
			 slots.add(s);
		 }
  }
  public int getconfig() {
	return config;
	  
  }
}
