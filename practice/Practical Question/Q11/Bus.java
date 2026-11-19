public class Bus extends Vehicle{
	Driver driver;
	
	public Bus(String brand, double speed,String engineType, Driver driver){
		super(brand, speed, engineType);
		this.driver = driver;
		
	}
	@Override
	public void start(){
		System.out.println("Bus is Starting....Passengers are boarding.");
		
	}
	@Override
	public void displayDetails(){
		System.out.println("---Bus Details---");
		super.displayDetails();
		driver.displayDetails();
	}
}