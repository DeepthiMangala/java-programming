public class CarApp{
	public static void main(String[] args){
		Car c1 = new Car();
		Car c2 = new Car("SW01235", "Toyota", 90000.0);
		
		c1.displayCarDetails();
		System.out.println();
		
		c2.displayCarDetails();
		
	}
}