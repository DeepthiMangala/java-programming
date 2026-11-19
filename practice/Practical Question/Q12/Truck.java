public class Truck extends Vehicle {
	
	public Truck(String vehicleID, String vehicleName, int rentalDays){
		super(vehicleID, vehicleName, rentalDays);
		
	}
	public double calculateRentalCost(){
		return rentalDays * 80.0;
		
	}
	@Override
	public void displayDetails(){
		System.out.println("---Truck Details----");
		super.displayDetails();
		System.out.println("Rental COst: "+ calculateRentalCost());
		System.out.println();
	}
}