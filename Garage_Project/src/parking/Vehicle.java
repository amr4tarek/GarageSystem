package parking;
import java.util.ArrayList;

public class Vehicle {
	  
	 String ModelName;  
	 int ID;  
	 int Modelyear;
	 int depth;
	 int width;
	long Starttime;
	long Endtime;
	  
	public Vehicle(String ModelName,int ID,int Modelyear,int width ,int depth)  
	{  
		this.ModelName = ModelName;  
		this.ID = ID;  
		this.Modelyear = Modelyear;
		this.width = width;
		this.depth = depth;

	}  
	
	
	public void SetStart(long Starttime ) {
 		this.Starttime= Starttime; 
 	}
 	public long getStart() {
 		
 		return Starttime;
 		
 	}
 	public void Setend(long Endtime ) {
 		this.Endtime= Endtime; 
 	}
 	public long getend() {
 		
 		return Endtime;
 		
 	}
}
