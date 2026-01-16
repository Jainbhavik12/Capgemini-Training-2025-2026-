package methodOverriding;

public class Child extends Parent{

	public void m1() {
		super.m1();
		System.out.println("Child");
	}

}
