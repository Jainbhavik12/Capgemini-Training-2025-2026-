package abstraction;

public abstract class Vehicle {
		
	public abstract void drive();
	
	public void brake() {
		System.out.println("Applying brake....");
	}
}
