package encapsulation;

public class Outer {
	private class Inner{
		static void display() {
			System.out.println("This is a static method");
		}
		
	}
	void test() {
		System.out.println("This is non-static method");
	}

}
