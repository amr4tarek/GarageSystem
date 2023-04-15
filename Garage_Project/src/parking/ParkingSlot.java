package parking;

public class ParkingSlot {
	 int depth;
	 int width;
	 int Slotid;
	 int avaib;
	 int vehid;
	 public ParkingSlot(int Slotid,int depth,int width )   
	 {  
		 this.Slotid= Slotid;
	 	this.depth = depth;
	 	this.width=width;
	 }
	 	// 0 mean no car park and slot is avaiable
	 	// 1 mean  car park and slot is not avaiable
	 	public void SetAvaiable(int avaib ) {
	 		this.avaib= avaib; 
	 	}
	 	public int getAvaiable() {
	 		
	 		return avaib;
	 		
	 	}
	 	public void SetVehid(int vehid ) {
	 		this.vehid= vehid; 
	 	}
	 	public int getVehid() {
	 		
	 		return vehid;
	 		
	 	}
	 }
	 
	