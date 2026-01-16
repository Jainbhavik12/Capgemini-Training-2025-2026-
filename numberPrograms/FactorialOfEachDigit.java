package numberPrograms;

import java.util.Scanner;

public class FactorialOfEachDigit {
	public static int factorialOfDigit(int num) {
		int fact = 1;
		for(int i=2; i<=num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num>0) {
			System.out.println("Factorial of "+num%10+" is "+factorialOfDigit(num%10));
			num=num/10;
		}

	}

}
