package parking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Garage {
	ArrayList<ParkingSlot> slots ;  
	LinkedList <Vehicle> veh ;
	int config;
	int sum  ;
	Garage(ArrayList<ParkingSlot> slots ,LinkedList <Vehicle> veh , int config , int sum)
	{
		this.slots=slots;
		this.veh=veh;
		this.config=config;
		this.sum=sum;
	}
	Scanner sc = new Scanner (System.in);

public void StartGarage() {
	
	 while(true)
	 {
			System.out.println("1.Enter Garage");
			System.out.println("2.Exit from garage");
			System.out.println("3.Display Car List");
			System.out.println("4.Income");
			System.out.println("5.Available Parking Slots");
			System.out.println("6.Exit");
			int inputNum1=sc.nextInt();
			switch(inputNum1) {
			case 1:
				
				if(veh.size()==slots.size())
				{
					System.out.println("No Slots Avaivable");
					break;
				}

				AddVehicle x = new AddVehicle(veh);
				x.NewVehicle();
				int j=0;
				for( int k =0 ; k<slots.size();k++) 
				{
					if(slots.get(k).depth< veh.getLast().depth||slots.get(k).width< veh.getLast().width ) 
					{
						j =j+1;
					}
				}
				if(j==(slots.size()))
				{
					System.out.println("no slot suitable for your vehicle to park");
					veh.removeLast();
					break;
				}
				if(config==1||config==2) 
				{
					//
					
					//best fit
					if(config==1) 
					{
						ParkIn_BestFit b = new ParkIn_BestFit(slots, veh);	
						b.BestFit();
						b.displaytime();	
					} 
					//first came first served
					else 
					{
						ParkIn_FCFS f = new ParkIn_FCFS(slots, veh);
						f.FirstCame();
						f.displaytime();
					}
				}
					
				break;
			case 2:
				
				ParkOut p = new ParkOut(slots, veh, sum);
				p.Park_out();
				p.displaytime();
				sum=p.getSum();
				break;
				
			case 3:
				AvailableVeh l = new AvailableVeh(veh);
				l.DisplayList();
				break;

			case 4:
				Income c= new Income(veh, sum);
				c.Total();
				break;

				
			case 5:
				AvailableSlots a = new AvailableSlots(slots);
				a.DisplaySlots();
				
				break;
				
			case 6:
				System.out.println("Have a nice day");
				default: System.exit(0);
				break;					
				
			}

	 }
	
	
}
	
}
