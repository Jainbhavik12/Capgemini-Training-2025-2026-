package numberPrograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int fact = 1;
		for(int i=2; i<=num; i++) {
			fact = fact * i;
		}
		
		System.out.println("Factorial of "+num+" is "+fact);

	}

}
