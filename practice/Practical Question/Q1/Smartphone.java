public class Smartphone{
	String brand;
	Battery battery;
	Processor processor;
	
	public Smartphone(String brand, int capacity, String model){
		this.brand = brand;
		battery = new Battery(capacity);
		processor = new Processor( model);
		
	}
	public void SmartphoneDetails(){
		System.out.println("Smartphone Brand: "+ brand);
		battery.batteryDisplayDetails();
		processor.processorDisplayDetails();
		
	}
	
}