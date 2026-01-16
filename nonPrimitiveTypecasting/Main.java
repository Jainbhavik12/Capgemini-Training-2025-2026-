package nonPrimitiveTypecasting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//upcasting 
		A a = new B();
		System.out.println(a);
		
		A a1 = new C();
		System.out.println(a1);
		
		A a2 = new D();
		System.out.println(a2);
		
		D d = (D)a;
		System.out.println(d);
		

	}

}
