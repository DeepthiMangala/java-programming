public class Tickets{
	private int ticketNumber;
	private String customerName;
	private int seatNumber;
	
	public Tickets(int ticketNumber, String customerName, int seatNumber){
		this.ticketNumber = ticketNumber;
		this.customerName = customerName;
		this.seatNumber = seatNumber;
		
	}
	public void setTicketNumber(int ticketNumber){
		this.ticketNumber = ticketNumber;
		
	}
	public void setCustomerName(String customerName ){
		this.customerName = customerName;
		
	}
	public void setSeatNumber(int seatNumber){
		this.seatNumber = seatNumber;
		
	}
	public int getTicketNumber(){
		return ticketNumber;
		
	}
	public String getCustomerName(){
		return customerName;
		
	}
	public int getSeatNumber(){
		return seatNumber;
		
	}
	
	
}