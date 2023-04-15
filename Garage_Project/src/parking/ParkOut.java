package parking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class ParkOut extends Park {
	int sum;
	ParkOut(ArrayList<ParkingSlot> slots, LinkedList<Vehicle> veh , int sum) {
		super(slots, veh);
		// TODO Auto-generated constructor stub
		this.sum=sum;
	}


	public void Park_out() 
	{
		Scanner sc = new Scanner (System.in);
		for(int i=0;i<veh.size();i++) 
		{
			System.out.println("vehicle avaiable with id : "+veh.get(i).ID);
		}
		if(veh.size()==0) {
			System.out.println("No vehicle parking");			
		}
		else {
		System.out.println("Enter id for car you want to remove "  );
		int id = sc.nextInt();
		
		for(int i=0;i<slots.size();i++) 
		{
			int count=0;
			if(veh.get(i).ID==id) 
			{

				for(int j=0;j<slots.size();j++) {
					if(slots.get(j).getVehid()==id) {
						slots.get(j).SetAvaiable(0);

					}
				}
			    
			    
				 long s =System.currentTimeMillis();
				 veh.get(i).Setend(s);
				 long h = TimeUnit.MILLISECONDS.toSeconds(veh.get(i).getend() -veh.get(i).getStart());

				System.out.println("Parking fee for vehicle with id "+veh.get(i).ID+" equal " +h * 5 +" EGP");
				sum = (int) ((h * 5) + sum);
				veh.remove(i);

				break;
				
			}
			else if(veh.get(i).ID!=id ){
				count =count+1;
				
				if(count==veh.size()) {
					System.out.println("Id not found");	
					break;
				}
			}
		}
	}
		}

public int getSum() 
{
		return sum;
	}
	
}
