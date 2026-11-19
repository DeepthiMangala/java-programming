public class FirstClass extends Flight {

    public FirstClass(String flightNumber, String destination,
                      int capacity, double basePrice) {

        super(flightNumber, destination, capacity, basePrice);
    }

    @Override
    public double calculateTotalPrice(int numSeats) {

        double price = super.calculateTotalPrice(numSeats);

        if (numSeats <= 0 || numSeats > getSeatsLeft()) {
            return 0;
        }

        return price * 2.0;
    }

}