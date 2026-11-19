public class Circle{
	private double radius;
	
	public Circle(){
		
	}
	
	public Circle(double radius){
		this.radius = radius;
		
	}
	public double calculateArea(){
		return (22/7.0)*radius*radius;
		
	}
	public double calculateArea(double diameter){
		return (22/7.0)*(diameter/2)*(diameter/2);
		
	}
	public void setRadius(double radius){
		this.radius = radius;
		
	}
	public double getRadius(){
		return radius;
		
	}
	
	
}