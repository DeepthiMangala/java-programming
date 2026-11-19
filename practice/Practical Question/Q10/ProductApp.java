import java.util.Scanner;
public class ProductApp{
	public static void main(String[] args){
		
		Scanner dd = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.print("Enter product ID: ");
		p.setProductId(dd.nextInt());
		
		dd.nextLine();
		
		System.out.print("Enter Product Name: ");
		p.setProductName(dd.nextLine());
		
		System.out.print("Enter the Price: ");
		p.setPrice(dd.nextDouble());
		
		System.out.print("Enter the Quantity: ");
		p.setQuantity(dd.nextInt());
		
		System.out.println();
		
		p.displayDetails();
		System.out.println();
		
		System.out.println("Total Value: "+p.calculateTotalValue());
		
	}
}