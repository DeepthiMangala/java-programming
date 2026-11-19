public class Vehicle{
	String brand;
	double speed;
	Engine engine;
	
	
	public Vehicle(String brand, double speed, String engineType){
		this.brand = brand;
		this.speed = speed;
		engine = new Engine(engineType);
		
		
	}
	public void start(){
		System.out.println("Vehicle Started....");
		
	}
	public void displayDetails(){
		System.out.println("Brand: "+ brand);
		System.out.println("Speed: "+ speed + "km/h");
		engine.displayDeatails();
	}
}