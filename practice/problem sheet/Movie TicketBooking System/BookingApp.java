public class BookingApp{
	public static void main(String[] args){
		
		BookingSystem booking = new BookingSystem();
		
		
		
		booking.bookTicket(1, "Alice", 1);
		booking.bookTicket(2, "Bob", 2);
		booking.bookTicket(3, "Charlie", 3);
		System.out.println();
		
		booking.cancelTicket(2);
		
		booking.bookTicket(4, "David", 2);
		
		booking.displayDetails();
		
		
	}
}