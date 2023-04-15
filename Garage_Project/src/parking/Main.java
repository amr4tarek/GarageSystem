package parking;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ParkingSlot> slots = new ArrayList<ParkingSlot>();  
		LinkedList <Vehicle> veh = new LinkedList<Vehicle>();
		int sum=0;
		Scanner sc = new Scanner (System.in);
		Owner o =new Owner(slots);
		o.Setup();
		int config = o.getconfig();
		Garage g = new Garage(slots, veh, config, sum);
		g.StartGarage();
	
}
	}
