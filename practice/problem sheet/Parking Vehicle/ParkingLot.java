public class ParkingLot{
	private Vehicle[] vehicles;
	private int vehicleCount;
	
	public ParkingLot(){
		vehicles = new Vehicle[5];
		vehicleCount = 0;
		
	}
	public void addVehicle(Vehicle vehicle){
		if(vehicleCount < vehicles.length){
			vehicles[vehicleCount] = vehicle;
			vehicleCount++;
			System.out.println("Vehicle Added Successfully");
			return;
		}
		System.out.println("Parking is full");
	}
	public void removeVehicle(String licensePlate){
		boolean found = false;
		
		for(int i = 0; i< vehicleCount; i++){
			if(vehicles[i].getLicensePlate().equals(licensePlate)){
				
				for(int j = i; j<vehicleCount-1; j++){
					vehicles[j] = vehicles[j+1];
				}
				vehicles[vehicleCount-1] = null;
				vehicleCount--;
				
				found = true;
				System.out.println("Vehicle Removed Successfully");
				break;
			}
		}
		if(!found){
			System.out.println("Vehicle not found.");
		}
	}
	public void displayDetails(){
		if(vehicleCount == 0){
			System.out.println("No vehicles parked");
			return;
		}
		for(int i = 0; i<vehicleCount; i++){
			System.out.println("License Plate: "+ vehicles[i].getLicensePlate());
			System.out.println("Owner Name: "+ vehicles[i].getOwnerName());
			System.out.println("Hours Parked: "+ vehicles[i].getHoursParked());
			System.out.println("-----------------------");
		}
	}
	
}