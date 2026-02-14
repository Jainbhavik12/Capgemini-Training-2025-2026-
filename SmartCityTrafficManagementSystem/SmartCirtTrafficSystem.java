package SmartCityTrafficManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SmartCirtTrafficSystem {
	static ArrayList<Vehicle> logs = new ArrayList<>();
	static HashSet<Vehicle> uniqueEntries = new HashSet<>();
	static LinkedList<Vehicle> lastEntries = new LinkedList<>();
	static HashMap<String, List<Vehicle>> checkpointMap = new HashMap<>();
	static HashMap<String, Vehicle> vehicleLookUp = new HashMap<>();
	static PriorityQueue<Vehicle> emergencyQueue = new PriorityQueue<>(new ComparisionByType());
	
	public static void addEntry() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vehicle Number: ");
		String number = sc.nextLine();
		
		System.out.print("Type (Car/Bike/Ambulance/FireTruck): ");
		String type = sc.nextLine();
		
		System.out.print("Checkpoint: ");
		String checkpt = sc.nextLine();
		
		Vehicle v = new Vehicle(number, type, checkpt);
		
		logs.add(v);
		uniqueEntries.add(v);
		
		if(lastEntries.size() > 5) {
			lastEntries.removeLast();
		}
		lastEntries.addFirst(v);
		
		vehicleLookUp.put(number, v);
		
		checkpointMap.computeIfAbsent(checkpt, k->new ArrayList<>()).add(v);
		
		if(type.equalsIgnoreCase("Ambulance") || type.equalsIgnoreCase("FireTruck")) {
			emergencyQueue.add(v);
		}
		System.out.println("Entry added!");
	}
	public static void removeDuplicates() {
		logs.clear();
		logs.addAll(uniqueEntries);
		System.out.println("Duplicates Removed!");
	}
	public static void displayByCheckpoint() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Checkpoint name: ");
		String checkpt = sc.nextLine();
		
		List<Vehicle> ans = checkpointMap.get(checkpt);
		System.out.println("Vehicles at "+checkpt);
		for(Vehicle v: ans) {
			System.out.println(v);
		}
	}
	public static void processEmergencyQueue() {
		if (emergencyQueue.isEmpty()) {
            System.out.println("No emergency vehicles.");
            return;
        }
        System.out.println("Processing emergency vehicle:");
        System.out.println(emergencyQueue.poll());
	}
	public static void trafficReport() {
		HashMap<String, Integer> congesion = new HashMap<>();
		for(Vehicle v : logs) {
			congesion.put(v.getCheckPoint(), congesion.getOrDefault(v.getCheckPoint(), 0)+1);
		}
		
		for(Entry<String, Integer> entry : congesion.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		String busiest = Collections.max(congesion.entrySet(),
                Map.Entry.comparingByValue()).getKey();

        String leastBusy = Collections.min(congesion.entrySet(),
                Map.Entry.comparingByValue()).getKey();
		
		
		System.out.println("Busiest: "+busiest);
		System.out.println("Least Busy: "+leastBusy);
		
	}
	
	public static void showLastFive() {
        System.out.println("Last 5 vehicles:");
        lastEntries.forEach(System.out::println);
    }
	
	
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n=== SMART CITY TRAFFIC MANAGEMENT ===");
	            System.out.println("1. Add Vehicle Entry");
	            System.out.println("2. Remove Duplicates");
	            System.out.println("3. Display Vehicles by Checkpoint");
	            System.out.println("4. Process Emergency Vehicle Queue");
	            System.out.println("5. Traffic Report");
	            System.out.println("6. Show Last 5 Vehicles");
	            System.out.println("7. Exit");
	            System.out.print("Choose: ");

	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1 -> addEntry();
	                case 2 -> removeDuplicates();
	                case 3 -> displayByCheckpoint();
	                case 4 -> processEmergencyQueue();
	                case 5 -> trafficReport();
	                case 6 -> showLastFive();
	                case 7 -> {
	                    System.out.println("Exiting...");
	                    return;
	                }
	                default -> System.out.println("Invalid choice!");
	}
	        }}

}
