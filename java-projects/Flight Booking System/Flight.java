public class Flight{
	private String flightNumber;
	private String destination;
	private boolean booked;
	private int capacity;
	private int seatsLeft;
	private double basePrice;
	
	public Flight(String flightNumber, String destination, int capacity, double basePrice){
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.booked = false;
		this.capacity = capacity;
		this.seatsLeft = capacity;
		this.basePrice = basePrice;
		
	}
	public String getFlightNumber(){
		return flightNumber;
		
	}
	public String getDestination(){
		return destination;
		
	}
	public boolean isBooked(){
		return booked;
		
	}
	public int getCapacity(){
		return capacity;
	}
	public int getSeatsLeft(){
		return seatsLeft;
		
	}
	public double getBasePrice(){
		return basePrice;
		
	}
	public double calculateTotalPrice(int numSeats){
		if(numSeats > 0 && numSeats <= seatsLeft){
			return basePrice * numSeats;
			
		}else{
			return 0;
		}
	}
	public void updateBookedstatus(){
		if(seatsLeft == 0){
			booked = true;
			
		}else{
			booked = false;
		}
	}
	public void book(int numSeats){
		if(numSeats <=0 || numSeats > seatsLeft){
			System.out.println("Boooking failed");
			return;
		}
		seatsLeft = seatsLeft - numSeats;
		updateBookedstatus();
		
		System.out.println("Successfully Booked...");
	
	}
	
	public void cancelBooked(int numSeats){
		if(numSeats <= 0 || numSeats > capacity-seatsLeft){
			System.out.println("canselling failed");
			return;
		}
		seatsLeft = seatsLeft + numSeats;
		updateBookedstatus();
		
		System.out.println("Successfully cancelled...");
		
	}
	public void displayDetails() {
		System.out.println("Flight Number: " + flightNumber);
		System.out.println("Destination: " + destination);
		System.out.println("Capacity: " + capacity);
		System.out.println("Seats Left: " + seatsLeft);
		System.out.println("Base Price: " + basePrice);
		System.out.println("Fully Booked: " + booked);
	}
	
	
}