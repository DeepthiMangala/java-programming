public class ClassicCar extends Car{
	
	public ClassicCar(String model, int year, double originalPrice){
		super(model, year, originalPrice);
		
	}
	@Override
	public double calculateSalePrice(){
		return 100000.00;
		
	}
}