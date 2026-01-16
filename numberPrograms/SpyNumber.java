package numberPrograms;

import java.util.Scanner;

public class SpyNumber {
	public static int sumOfDigits(int num) {
		
		int sum = 0;
		while(num> 0) {
			sum=sum+num%10;
			num=num/10;
			
		}
		return sum;
	}
	public static int prodOfDigits(int num) {
		int product = 1;
		while(num > 0) {
			product = product * num%10;
			num=num/10;
			
		}
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = sumOfDigits(num);
		int product = prodOfDigits(num);
		
		
		if(sum == product) {
			System.out.println(num+" is a spy number");
		}
		else {
			System.out.println(num+" is not a spy number");
		}

	}

}
