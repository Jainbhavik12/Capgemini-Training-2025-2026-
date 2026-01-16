package decisionMakingStatements;

import java.util.Scanner;

public class GradeOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		
		int percentage = (m1+m2+m3+m4+m5)/5;
		
		if(percentage >= 95) {
			System.out.println("O Grade");
		}
		else if(percentage >= 85 && percentage < 95 ) {
			System.out.println("A+ Grade");
		}
		else if(percentage >= 75 && percentage < 95 ) {
			System.out.println("A Grade");
		}
		else if(percentage >= 65 && percentage < 75 ) {
			System.out.println("B+ Grade");
		}
		else if(percentage >= 55 && percentage < 65 ) {
			System.out.println("B Grade");
		}
		else {
			System.out.println("Fail");
		}

	}

}
