public class Vehicle{
	String brand;
	int speed;
	
	public Vehicle(String brand, int speed){
		this.brand = brand;
		this.speed = speed;
		
	}
	public void displayDetails(){
		System.out.println("Brand: "+ brand);
		System.out.println("Speed: "+ speed);
		
	}
	
}