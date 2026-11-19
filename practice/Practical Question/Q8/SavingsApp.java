import java.util.Scanner;
public class SavingsApp{
	public static void main(String[] args){
		
		Scanner dd = new Scanner(System.in);
			
		System.out.print("Enter Account Number: ");
		int accNum = dd.nextInt();
		
		dd.nextLine();
		
		System.out.print("Enter Account Holder Name: ");
		String holderName = dd.nextLine();
		
		System.out.print("Enter Initial Deposit: ");
		double depositt = dd.nextDouble();
		
		SavingsAccount saving = new SavingsAccount(accNum, holderName, depositt);
		
		System.out.println();
		System.out.println("Deposited: "+ depositt +","+ " New Balance: "+saving.getAccountBalance());
		
		System.out.print("Enter deposit amount: ");
		double amount1 = dd.nextDouble();
		
		saving.deposit(amount1);
		
		System.out.print("Enter Withdrawl Amount: ");
		double amount2 = dd.nextDouble();
		
		saving.withdraw(amount2);
		
		System.out.println();
		saving.displayDetails();
		
		
	}
}