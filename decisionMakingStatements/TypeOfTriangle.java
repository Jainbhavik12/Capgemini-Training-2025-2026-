package decisionMakingStatements;

import java.util.Scanner;

public class TypeOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		
		if(s1==s2 && s2==s3) {
			System.out.println("Equilateral Triangle");
		}
		else if(s1 != s2 && s2 != s3 && s3 != s1 ) {
			System.out.println("Scalene Traingle");
		}
		else {
			System.out.println("Isosceles Triangle");
		}
		

	}

}
