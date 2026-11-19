public class Car{
	protected String model;
	protected int year;
	protected double originalPrice;
	
	public Car(String model, int year, double originalPrice){
		this.model = model;
		this.year = year;
		this.originalPrice = originalPrice;
		
	}
	public double calculateSalePrice(){
		return originalPrice;
		
	}
}