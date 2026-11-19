import java.util.Scanner;
public class CircleApp{
	public static void main(String[] args){
		Scanner dd = new Scanner(System.in);
		
		Circle c = new Circle();
		
		System.out.print("Enter the value of radius: ");
		c.setRadius(dd.nextDouble());
		
		System.out.print("Area using radius: ");
		System.out.println(c.calculateArea());
		
		System.out.println();
		System.out.print("Enter the value of diameter: ");
		double diameter = dd.nextDouble();
		
		System.out.print("Area using diameter: ");
		System.out.println(c.calculateArea(diameter));
	}
}