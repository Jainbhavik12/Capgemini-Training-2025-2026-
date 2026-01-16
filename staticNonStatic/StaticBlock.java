package staticNonStatic;

public class StaticBlock {
	
	static {
		System.out.println("Hii.. i am static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hii.. i am main method");
		

	}
	static {
		System.out.println("Hii.. i am 2nd static block");
	}

}
