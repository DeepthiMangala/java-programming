public class Bank{
	private BankAccount[] accounts;
	private int accountCount;
	
	public Bank(){
		accounts = new BankAccount[5];
		accountCount = 0;
		
	}
	public void addAccount(BankAccount account){
		if(accountCount < accounts.length){
			accounts[accountCount] = account;
			accountCount++;
			System.out.println("Account added successfully");
			return;
			
		}
		System.out.println("Bank is full");
	}
	public void withdrawMoney(int accountNum, double amount){
		boolean found = false;
		
		for(int i = 0; i < accountCount; i++){
			if(accounts[i].getAccountNumber() == accountNum){
				found = true;
				try{
					accounts[i].withdraw(amount);
					System.out.println("Withdrawl Successfull");
					System.out.println("New Balance: "+ accounts[i].getBalance());
					
				}catch(IllegalArgumentException e){
					System.out.println(e.getMessage());
					
				}
				break;
				
			}
			
		}
		if(!found){
			System.out.println("Account not found");
			
		}
	}
	public void removeAccount(int accNum){
		
		boolean rfound = false;
		
		for(int i = 0; i< accountCount; i++){
			if(accounts[i].getAccountNumber() == accNum){
				rfound = true;
				for(int j = i; j<accountCount-1; j++){
					accounts[j] = accounts[j+1];
					
				}
				accounts[accountCount-1] = null;
				accountCount--;
				System.out.println("Account Removed Successfully");
				return;
			}
		}
		System.out.println("Account not found");
	}
	
	public void displayDetails(){
		for(int i = 0; i< accountCount; i++){
			System.out.println("Account Number: "+ accounts[i].getAccountNumber());
			System.out.println("Account Holder: "+accounts[i].getAccountHolder());
			System.out.println("Balance: "+ accounts[i].getBalance());
			System.out.println("-----------------------");
		}
	}
	
}