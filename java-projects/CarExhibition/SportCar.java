public class SportCar extends Car{
	
	public SportCar(String model, int year, double originalPrice){
		super(model, year, originalPrice);
		
	}
	@Override
	public double calculateSalePrice(){
		if(year > 2000){
			return originalPrice*0.75;
			
		}else if(year > 1995){
			return originalPrice * 0.5;
			
		}else{
			return originalPrice * 0.25;
			
		}
		
	}
}