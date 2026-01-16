package inheritance;

public class Triangle extends Shape{
	double base;
	double height;
	
	Triangle(double base, double height){
		this.base = base;
		this.height=height;
	}
	
	public double areaTriangle() {
		area = (double)1/2 * base * height;
		return area;
	}

}
