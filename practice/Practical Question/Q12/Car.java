public class Car extends Vehicle{
	
	public Car(String vehicleID, String vehicleName, int rentalDays){
		super(vehicleID, vehicleName, rentalDays);
		
	}
	public double calculateRentalCost(){
		return rentalDays * 50.0;
		
	}
	@Override
	public void displayDetails(){
		System.out.println("---Car Detaills---");
		super.displayDetails();
		System.out.println("Rental Cost: $"+ calculateRentalCost());
		System.out.println("------------------");
	}
}