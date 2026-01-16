package inheritance;

public class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	public double areaOfCircle() {
		area = 3.14 * radius * radius;
		return area;
	}

}
