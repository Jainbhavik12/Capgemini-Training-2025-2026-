package classAnsObjects;

public class Box {
	static double length;
	double breadth;
	
	Box(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getArea() {
		return length*breadth;
	}

}
