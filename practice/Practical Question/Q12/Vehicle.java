public class Vehicle{
	String vehicleID;
	String vehicleName;
	int rentalDays;
	
	public Vehicle(){
		
	}
	
	public Vehicle(String vehicleID, String vehicleName, int rentalDays){
		this.vehicleID = vehicleID;
		this.vehicleName = vehicleName;
		this.rentalDays = rentalDays;
		
	}
	public void displayDetails(){
		System.out.println("Vehicle ID: "+vehicleID);
		System.out.println("Vehicle Name: "+ vehicleName);
		System.out.println("Rental Days: "+ rentalDays);
		
	}
	
}