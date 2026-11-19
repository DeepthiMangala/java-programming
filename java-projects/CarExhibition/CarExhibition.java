import java.util.ArrayList;

public class CarExhibition{
	ArrayList<Car> cars = new ArrayList<>();
	
	public CarExhibition(){
		
	}
	public void addCar(Car car){
		cars.add(car);
		
	}
	public double TotalPrice(){
		double total = 0.0;
		
		for(Car c : cars){
			total = total + c.calculateSalePrice();
		}
		return total;
	}
}