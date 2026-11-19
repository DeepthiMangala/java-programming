public class VehicleApp{
	public static void main(String[] args){
		ParkingLot parking = new ParkingLot();

		Vehicle v1 = new Vehicle( "ABC123",  "John Doe", 2);
		Vehicle v2 = new Vehicle( "XYZ789",  "Jane Smith", 4);
		Vehicle v3 = new Vehicle( "LMN456", "Bob Brown", 1);
		
		parking.addVehicle(v1);
		parking.addVehicle(v2);
		parking.addVehicle(v3);
		System.out.println();
		
		parking.displayDetails();
		System.out.println();
		
		parking.removeVehicle("XYZ789");
		System.out.println();
		
		parking.displayDetails();
		
		
	}
}