package inheritance;

public class ChildClass extends ParentClass{
	
	public void displayB() { // for accessing non static variable
		System.out.println(b);
	}
	
	ChildClass(){
		
		//System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//m1();
		//System.out.println(a);
		ChildClass A = new ChildClass();
		//A.displayB();
		
		//A.sayHello();
		

	}

}
