package inheritance;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t1 = new Triangle(49, 5);
		t1.areaTriangle();
		System.out.println(t1.area);
		
		Circle c1 = new Circle(8);
		c1.areaOfCircle();
		System.out.println(c1.area);
		
		Square s1 = new Square(5);
		s1.areaOfSquare();
		System.out.println(s1.area);
		

		
	}

}
