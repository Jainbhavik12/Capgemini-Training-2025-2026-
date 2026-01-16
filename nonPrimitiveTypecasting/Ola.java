package nonPrimitiveTypecasting;

import java.util.Scanner;

public class Ola {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Mini");
		System.out.println("Press 2 for Sedan");
		System.out.println("Press 3 for Luxury");

		int input = sc.nextInt();
		Cab b=null;
		
		
		
		switch(input) {
			case 1: {
				b = new Mini();
			}
			break;
			case 2: {
				b = new sedan();
			}
			break;
			case 3: {
				b = new Luxury();
			}
			break;
			default:
				System.out.println("Invalid input");
		}
		
		Mini m = (Mini)b;
		System.out.println(m.cabFair);
		
	}

}
