package decisionMakingStatements;

import java.util.Scanner;

public class DivisibleBy5and11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n % 5 == 0 && n % 11 == 0) {
			System.out.println(n+" is divisible by 5 and 11");
		}
		else {
			System.out.println(n+" is not divisible by 5 and 11");
		}

	}

}
