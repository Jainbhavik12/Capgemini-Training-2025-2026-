package ObjectClass;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of phones you want to store: ");
		int n = sc.nextInt();
		Phone[] phoneArray = new Phone[n+1];
		
		for(int i=1; i<=n; i++) {
			System.out.println("Enter RAM and ROM for phone "+i+": 	");
			int ram=sc.nextInt();
			int rom=sc.nextInt();
			phoneArray[i] = new Phone(ram, rom);
			
		}
		
		for(int i=1; i<=n; i++) {
			System.out.println(phoneArray[i].toString());
		}

	}

}
