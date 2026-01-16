package encapsulationAssignment;

public class VehicleSpeedControl {
	private double speed;
	
	public void increaseSpeed() {
		speed+=20;
	}
	public void decreaseSpeed() {
		speed-=10;
	}
	
	public void getSpeed() {
		System.out.println("Vehicle speed is "+speed);
	}

}
