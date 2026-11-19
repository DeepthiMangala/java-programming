
public class FlightBookingSystem {

    public static void main(String[] args) {

        // Polymorphism: parent references, child objects
        Flight[] flights = new Flight[3];

        flights[0] = new EconomyClass(
                "F101", "Colombo", 5, 10000);

        flights[1] = new BusinessClass(
                "F102", "London", 4, 50000);

        flights[2] = new FirstClass(
                "F103", "Dubai", 3, 100000);

        // Display initial details
        System.out.println("=== Initial Flight Details ===");

        for (Flight flight : flights) {
            flight.displayDetails();
            System.out.println();
        }

        // Book 2 Economy seats
        Flight economy = flights[0];

        System.out.println("=== Economy Booking ===");

        double price = economy.calculateTotalPrice(2);
        System.out.println("Total Price: " + price);

        economy.book(2);

        System.out.println("Seats Left: "
                + economy.getSeatsLeft());

        // Book all Business seats
        Flight business = flights[1];

        System.out.println("\n=== Business Booking ===");

        System.out.println("Total Price: "
                + business.calculateTotalPrice(4));

        business.book(4);

        System.out.println("Seats Left: "
                + business.getSeatsLeft());

        System.out.println("Fully Booked: "
                + business.isBooked());

        // Try to book an unavailable seat
        System.out.println("\n=== Invalid Booking ===");

        business.book(1);

        // Cancel one Economy seat
        System.out.println("\n=== Cancel Booking ===");

        economy.cancelBooked(1);

        System.out.println("Economy Seats Left: "
                + economy.getSeatsLeft());

        // Display final seat availability
        System.out.println("\n=== Final Seat Availability ===");

        for (Flight flight : flights) {
            System.out.println(
                    flight.getFlightNumber()
                    + " - " + flight.getDestination()
                    + " - Seats Left: "
                    + flight.getSeatsLeft()
                    + " - Fully Booked: "
                    + flight.isBooked());
        }
		for(Flight flight : flights){
			if(flight instanceof EconomyClass){
				EconomyClass ec = (EconomyClass) flight;
				if(ec.getSeatsLeft() > 0){
					ec.displayDetails();
				}
			}
		}
    }
}
