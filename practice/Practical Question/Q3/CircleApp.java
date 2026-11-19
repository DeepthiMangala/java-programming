import java.util.Scanner;
public class CircleApp{
	public static void main(String[] args){
		Scanner dd = new Scanner(System.in);
		
		Circle c = new Circle();
		
		System.out.print("Enter the value of radius: ");
		c.setRadius(dd.nextDouble());
		
		System.out.print("Area using radius: ")
		c.calculateArea();
		
	}
}