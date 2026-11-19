public class Truck extends Vehicle{
	Driver driver;
	
	public Truck(String brand, double speed,String engineType, Driver driver){
		super(brand, speed,engineType);
		this.driver = driver;
		
	}
	@Override
	public void start(){
		System.out.println("Truck Started....");
		
	}
	@Override
	public void displayDetails(){
		System.out.println("---Truck Details---");
		super.displayDetails();
		driver.displayDetails();
	}
}