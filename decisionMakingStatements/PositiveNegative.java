package decisionMakingStatements;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("The number is Zero");
		}
		else if(num > 0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is Negative");
		}

	}

}
