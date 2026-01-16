package inheritance;

public class ParentClass {
	
	static int a = 45; //static variable
	int b = 7;  // non static variable
	
	ParentClass(){
		System.out.println("Parent class constructor");
	}

	public static void m1() {  // static method
		System.out.println("Parent");
	}
	public void sayHello() {
		System.out.println("Hello");
	}

}
