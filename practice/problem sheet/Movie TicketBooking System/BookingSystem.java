public class BookingSystem{
	private Tickets[] tickets;
	private int seatCount;
	
	public BookingSystem(){
		tickets = new Tickets[10];
		seatCount = 0;
		
	}
	/*public void addTicket(Tickets ticket){
		if(seatCount < tickets.length ){
			tickets[seatCount] = ticket;
			seatCount++;
			
			System.out.println("Booked the ticket successfully");
			return;
		}
		System.out.println("Sorry!...Seats are not available");
		
	}
	public void cancelTicket(int ticketNum){
		boolean found = false;
		
		for(int i = 0; i < seatCount; i++){
			if(tickets[i].getTicketNumber() == ticketNum){
				found = true;
				
				for(int j = i; i< seatCount-1; j++){
					tickets[j] = tickets[j+1];
					
				}
				tickets[seatCount-1] = null;
				seatCount--;
				
				System.out.println("Successfully canceled the ticket");
				return;
			}
		}
		if(!found){
			System.out.println("Ticket not found");
		}
	}*/
	public void bookTicket(int ticketNum, String customerName, int seatNum){
		
		if(seatNum < 1 || seatNum > 10){
			System.out.println("Invalid Seat Number");
			return;
			
		}
		for(int i = 0; i< seatCount; i++){
			if(tickets[i].getTicketNumber() == ticketNum){
				System.out.println("Ticket Number Already Exits!");
				return;
				
			}
			if(tickets[i].getSeatNumber() == seatNum){
				System.out.println("Seat already booked!");
				return;
				
			}
			
		}
		if(seatCount >= tickets.length){
			System.out.println("All seats are booked!");
			return;
			
		}
		tickets[seatCount] = new Tickets(ticketNum, customerName, seatNum);
		seatCount++;
		
		System.out.println("Booked the ticket successfully");
	}
	public void cancelTicket(int ticketNum){
		boolean found = false;
		
		for(int i =0; i<seatCount; i++){
			if(tickets[i].getTicketNumber() == ticketNum){
				found = true;
				
				for(int j = i; j<seatCount-1; j++){
					tickets[j] = tickets[j+1];
					
					
				}
				tickets[seatCount-1] = null;
				seatCount--;
				
				System.out.println("Successfully cancelles the ticket");
				return;
			}
			
		}
		if(!found){
			System.out.println("tivket not found");
		}
	}
	public void displayDetails(){
		if(seatCount ==0){
			System.out.println("No bookings available");
			return;
			
		}
		System.out.println("Current Bookings: ");
		
		for(int i = 0; i< seatCount; i++){
			System.out.println("Ticket Number: "+ tickets[i].getTicketNumber());
			System.out.println("Customer Name: "+ tickets[i].getCustomerName());
			System.out.println("Seat Number: "+ tickets[i].getSeatNumber());
			System.out.println("--------------------");
		}
	}
	
	
}