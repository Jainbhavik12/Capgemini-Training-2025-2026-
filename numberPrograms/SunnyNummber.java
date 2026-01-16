package numberPrograms;

import java.util.Scanner;

public class SunnyNummber {
	public static int factorialOfDigit(int num) {
		int fact = 1;
		for(int i=2; i<=num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num; 
		int sum = 0;
		while(num > 0) {
			sum = sum + factorialOfDigit(num%10);
			num = num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is a Sunny Number");
		}
		else {
			System.out.println(temp+" is not a Sunny Number");
		}

	}

}
