package inheritance;

public class Son extends Father{
	String name = "Bhavik";
	public void display() {
		System.out.println("My Father name is: "+ super.name);
		System.out.println("My name is: "+ this.name);
	}
	
	public static void main(String[] args) {
		Son s1 = new Son();
		
		s1.display();
	}
}
