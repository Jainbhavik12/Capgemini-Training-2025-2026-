package abstractionAssignment;

public abstract class Ride {
	public abstract int calculateFare(int distance);
	
	public static void rideDetails() {
		System.out.println("This ride will be charged per km");
	}

}
