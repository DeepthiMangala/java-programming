public class Car extends Vehicle{
	String model;
	Engine engine;
	
	public Car(String brand, int speed, String model,String engineType){
		super(brand, speed);
		this.model = model;
		engine = new Engine(engineType);
		
	}
	public void CarDetails(){
		super.displayDetails();
		System.out.println("Model: "+model);
		engine.EngineDetails();
		
	}
	
	
}