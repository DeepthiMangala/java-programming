import java.util.Scanner;
public class CustomerApp{
	public static void main(String[] args){
		Scanner dd = new Scanner(System.in);
		
		Customer c = new Customer();
		
		System.out.print("Enter customer ID: ");
		c.setCoustomerId(dd.nextInt());
		
		dd.nextLine();
		
		System.out.print("Enter Customer Name: ");
		c.setName(dd.nextLine());
		
		System.out.print("Enter Units Consumed: ");
		c.setUnitConsumed(dd.nextInt());
		
		System.out.println();
		
		c.displayCustomerDetails();
		
	}
}