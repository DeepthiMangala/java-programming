public class CarApp{
	public static void main(String[] args){
		
		Car cc = new ClassicCar("Mini", 1980, 150000.0);
		Car sc = new SportCar("Ferrari", 2005, 200000.0);
		
		CarExhibition exhibition = new CarExhibition();
		
		exhibition.addCar(cc);
		exhibition.addCar(sc);
		
		System.out.println("Total Price: "+ exhibition.TotalPrice());
	}
}