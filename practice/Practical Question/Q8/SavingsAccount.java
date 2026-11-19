public class SavingsAccount{
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	public SavingsAccount(int accountNumber, String accountHolderName, double accountBalance){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		
	}
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
		
	}
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName = accountHolderName;
		
	}
	public int getAccountNumber(){
		return accountNumber;
		
	}
	public String getAccountHolderName(){
		return accountHolderName;
		
	}
	public double getAccountBalance(){
		return accountBalance;
		
	}
	public void deposit(double amount1){
		
		if(amount1 > 0){
			accountBalance = accountBalance + amount1;
			System.out.println("Deposited: "+ amount1+", New Balance: "+ accountBalance);
			
		}else{
			System.out.println("Invalid amount");
			
		}
	}
	public void withdraw(double amount2){
		if(amount2 > 0 && amount2 <= accountBalance){
			accountBalance = accountBalance - amount2;
			System.out.println("Withdrawn: "+amount2+", New Balance: "+ accountBalance);
			
		}else{
			System.out.println("Insufficient funds");
			
		}
	}
	public void displayDetails(){
		System.out.println("Final Account Details: ");
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Account Holder: "+ accountHolderName);
		System.out.println("Balance :"+ accountBalance);
	}
	
	
}