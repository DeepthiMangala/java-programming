public class Driver{
	String name;
	String licenseNumber;
	
	public Driver(String name,String licenseNumber){
		this.name = name;
		this.licenseNumber = licenseNumber;
		
	}
	public void displayDetails(){
		System.out.println("Driver Name: "+ name);
		System.out.println("License Number: "+ licenseNumber);
		
	}
}