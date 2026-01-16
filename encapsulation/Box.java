package encapsulation;

public class Box {
	double length;
	
	public Box(double length) {
		this.length = length;
	}
	public Box() {
		
	}
	
	public static Box createBox() {
		return new Box();
	}
	public static Box createBox(double length) {
		return new Box(length);
	}

}
