public class VehicleApp{
	public static void main(String[] args){
		Car c = new Car("SW12345", "BMW", 30);
		Truck t = new Truck("AC78564", "Toyota", 15);
		
		c.displayDetails();
		t.displayDetails();
	}
}