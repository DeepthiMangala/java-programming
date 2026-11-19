public class Car{
	private String regNumber;
	private String modelName;
	private double price;
	
	public Car(){
		
	}
	
	public Car(String regNumber, String modelName, double price){
		this.regNumber = regNumber;
		this.modelName = modelName;
		this.price = price;
		
	}
	public void setRegNumber(String regNumber){
		this.regNumber = regNumber;
		
	}
	public void setModelName(String modelName){
		this.modelName = modelName;
		
	}
	public void setPrice(double price){
		this.price = price;
		
	}
	public String getRegNumber(){
		return regNumber;
		
	}
	public String getModelName(){
		return modelName;
		
	}
	public double getPrice(){
		return price;
		
	}
	public void displayCarDetails(){
		System.out.println("Register Number: "+ regNumber);
		System.out.println("Model Name: "+ modelName);
		System.out.println("Price: "+ price);
		
	}
	
	
}