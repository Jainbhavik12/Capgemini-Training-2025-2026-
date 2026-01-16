package abstraction;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Car();
		v1.drive();
		v1.brake();
		
		Truck t1 = new HeavyTruck();
		t1.drive();
		t1.brake();
		t1.load();

	}

}
