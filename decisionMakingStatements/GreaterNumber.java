package decisionMakingStatements;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			
				System.out.println(n1+" is a greater number");
			
		}
		else if(n2 > n1 && n2>n3) {
			
				System.out.println(n2+" is a greater number");
			
		}
		else {
			System.out.println(n3+" is a greater number");
		}
		
		
		

	}

}
