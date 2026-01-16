package staticNonStatic;

public class Reactangle {
	double length;
	double breadth;
	
	Reactangle() {
		
	}
	public Reactangle(double length) {
		this();
		this.length = length;
	}
	public Reactangle(double length, double breadh) {
		this(length);
		this.breadth = breadth;
		
	}
	
	
	public double getArea() {
		return length*breadth;
	}
	public double getArea(double length) {
		return length*length;
	}

}
