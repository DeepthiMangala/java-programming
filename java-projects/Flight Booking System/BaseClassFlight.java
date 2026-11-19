public class BaseClassFlight{
	private String flightNumber;
	private String destination;
	private boolean booked;
	private int capacity;
	private int seatsLeft;
	private double basePrice;
	
	public BaseClassFlight(String flightNumber, String destination,boolean booked, int capacity, int seatsLeft, double basePrice){
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.booked = booked;
		this.capacity = capacity;
		this.seatsLeft = seatsLeft;
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
		if(numSeats > 0 || numSeats < seatsLeft){
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
	public boolean book(int numSeats){
		if(numSeats <=0 || numSeats > seatsLeft){
			return false;
			
		}
		seatsLeft = seatsLeft - numSeats;
		updateBookedstatus();
		
		return true;
	
		}
	}
	public boolean cancelBooked(int numSeats){
		if(numSeats <= 0 || numSeats > capacity-seatsLeft){
			return false;
			
		}
		seatsLeft = seatsLeft + numSeats;
		updateBookedstatus();
		
		return true;
	}
	
	
}