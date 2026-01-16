package wrapperClasses;

public class AutoBoxing {

	public static void main(String[] args) {
		// Boxing
		int a = 10;
		Integer i = new Integer(a);
		System.out.println(i);
		
		if (i instanceof Integer) {
		    System.out.println("It is a Integer");
		}
		
		int b = 20;
		Integer i1 = Integer.valueOf(b);
		System.out.println(i1);
		
		
		//AutoBoxing
		int c = 30;
		Integer i2 = c;
		System.out.println(i2);
		
		
		//UnBoxing
		int d = i2.intValue();
		System.out.println(i2);
		
		//AutoUnBoxing
		int e = 77;
		Integer i3 = e;
		int f = i3;
		System.out.println(f);
		

	}

}
