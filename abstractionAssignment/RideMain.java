package abstractionAssignment;

import java.util.Scanner;

public class RideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance you want to cover: ");
		int distance = sc.nextInt();
		
		Ride r1 = new BikeRide();
		System.out.println("Fare for Bike Ride: "+r1.calculateFare(distance));
		
		Ride r2 = new AutoRide();
		System.out.println("Fare for Auto Ride: "+r2.calculateFare(distance));
		
		

	}

}
