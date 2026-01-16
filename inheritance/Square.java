package inheritance;

public class Square extends Shape{
	double side;
	
	Square(double side){
		this.side = side;
	}
	
	public double areaOfSquare() {
		area = side*side;
		return area;
	}

}
