package parking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class AddVehicle {
	LinkedList <Vehicle> veh;
	Scanner sc = new Scanner (System.in);

	AddVehicle(LinkedList <Vehicle> veh)
	{
	

		this.veh=veh;
	}
	
	public void NewVehicle() 
	{

		 System.out.println("Enter model name");
		 String ModelName = sc.next();
		 System.out.println("Enter model year");
		 int Modelyear = sc.nextInt();
		 System.out.println("Enter Id");
		 int ID = sc.nextInt();
		 System.out.println("Enter depth");
		 int depth = sc.nextInt();
		 System.out.println("Enter width");
		 int width = sc.nextInt();

		Vehicle v = new Vehicle(ModelName,ID,Modelyear,width,depth);
		veh.add(v);
	}
	
}
