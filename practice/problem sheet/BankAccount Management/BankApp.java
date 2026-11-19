public class BankApp{
	public static void main(String[] args){
		Bank bank = new Bank();
		
		BankAccount b1 = new BankAccount( 1001,  "Alice", 5000.0 );
		BankAccount b2 = new BankAccount( 1002,  "Bob", 3000.0 );
		
		bank.addAccount(b1);
		bank.addAccount(b2);
		System.out.println();
		
		bank.withdrawMoney(1001, 6000.0);
		System.out.println();
		
		bank.withdrawMoney(1002, 1000.0);
		System.out.println();
		
		bank.displayDetails();
		
	}
}