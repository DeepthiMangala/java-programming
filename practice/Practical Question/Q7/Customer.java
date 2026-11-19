public class Customer{
	private int customerId;
	private String name;
	private int unitConsumed;
	
	public Customer(){
		
	}
	
	public Customer(int customerId, String name, int unitConsumed){
		this.customerId = customerId;
		this.name = name;
		this.unitConsumed = unitConsumed;
		
	}
	public void setCoustomerId(int customerId){
		this.customerId = customerId;
		
	}
	public void setName(String name){
		this.name = name;
		
	}
	public void setUnitConsumed(int unitConsumed){
		this.unitConsumed = unitConsumed;
		
	}
	public int getCustomerId(){
		return customerId;
		
	}
	public String getName(){
		return name;
		
	}
	public int getUnitConsumed(){
		return unitConsumed;
		
	}
	public double calculateBill(){
		if(unitConsumed > 0 && unitConsumed <= 100 ){
			return unitConsumed * 20;
			
		}else if(unitConsumed > 100 && unitConsumed <= 300){
			return (100 * 20 ) + ((unitConsumed-100) * 30);
			
		}else  {
			return (100 * 20) + (200 * 30) + ((unitConsumed-300) * 40);
		}
		
	}
	public void displayCustomerDetails(){
		System.out.println("Customer Details: ");
		System.out.println("Customer ID: "+ customerId);
		System.out.println("Name: "+ name);
		System.out.println("Units Consumed: "+ unitConsumed);
		System.out.println("Bill AMount: "+ calculateBill());
	}
	
}