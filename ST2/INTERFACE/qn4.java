// Transport Interface
interface Transport {
    // Constants for fares
    double BUS_BASE_FARE = 50;
    double BUS_PER_KM = 1.5;

    double TRAIN_BASE_FARE = 100;
    double TRAIN_PER_KM = 1.0;

    double FLIGHT_BASE_FARE = 500;
    double FLIGHT_PER_KM = 5.0;

    // Abstract methods
    void bookTicket(String source, String destination);
    double calcFare(int distance);
}






// Bus class
class Bus implements Transport {
    @Override
    public void bookTicket(String source, String destination) {
        System.out.println("Bus ticket booked from " + source + " to " + destination);
    }

    @Override
    public double calcFare(int distance) {
        return BUS_BASE_FARE + (BUS_PER_KM * distance);
    }
}



// Train class
class Train implements Transport {
    @Override
    public void bookTicket(String source, String destination) {
        System.out.println("Train ticket booked from " + source + " to " + destination);
    }

    @Override
    public double calcFare(int distance) {
        return TRAIN_BASE_FARE + (TRAIN_PER_KM * distance);
    }
}

// Flight class
class Flight implements Transport {
    @Override
    public void bookTicket(String source, String destination) {
        System.out.println("Flight ticket booked from " + source + " to " + destination);
    }

    @Override
    public double calcFare(int distance) {
        return FLIGHT_BASE_FARE + (FLIGHT_PER_KM * distance);
    }
}


// Booking Portal
class BookingPortal {
    public void openPortal(Transport t, String source, String destination, int distance) {
        t.bookTicket(source, destination);
        double fare = t.calcFare(distance);
        System.out.println("Total Fare: ₹" + fare);
        System.out.println("--------------------------");
    }
}

// Test Class
public class qn4 {
    public static void main(String[] args) {
        BookingPortal portal = new BookingPortal();

        // Booking Bus
        Transport bus = new Bus();
        portal.openPortal(bus, "Delhi", "Agra", 200);

        // Booking Train
        Transport train = new Train();
        portal.openPortal(train, "Delhi", "Mumbai", 1200);

        // Booking Flight
        Transport flight = new Flight();
        portal.openPortal(flight, "Delhi", "Bangalore", 2000);
    }
}


