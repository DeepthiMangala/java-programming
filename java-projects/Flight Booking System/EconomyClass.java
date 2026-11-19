public class EconomyClass extends Flight {

    public EconomyClass(String flightNumber, String destination,
                        int capacity, double basePrice) {

        super(flightNumber, destination, capacity, basePrice);
    }

    @Override
    public double calculateTotalPrice(int numSeats) {
        return super.calculateTotalPrice(numSeats);
    }
	
} 