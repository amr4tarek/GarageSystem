package parking;

import java.util.LinkedList;

public class Income {
	int sum;
	LinkedList <Vehicle> veh ;
	Income(LinkedList <Vehicle> veh ,int sum){
		this.veh=veh;
		this.sum=sum;
	}
	public void Total() {
		if (sum==0) {
			System.out.println("no vehicle left the garage so income equal " + sum);

		}
		else {
			System.out.println("Total income equal " + sum);		
		}
		System.out.println("Number of vehicle now in garage equal " + veh.size() );
	}
}
