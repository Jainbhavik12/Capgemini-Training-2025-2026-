package methods;

public class AreaOfShapes {
	
	public static double areaOfCircle() {
		double area = 0;
		double radius = 5;
		
		area = (double)22/7 * radius*radius;
		return area;
		
	}
	public static double areaOfSquare() {
		int side = 5;
		
		return side*side;
	}
	public static double areaOfTriangle() {
		int height = 5;
		int base = 7;
		double area = (double)1/2 * base*height;
		return area;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areaOfSquare());
		System.out.println(areaOfCircle());
		System.out.println(areaOfTriangle());
		

	}

}
