package numberPrograms;

import java.util.Scanner;

public class NeonNumber {
public static int sumOfDigits(int num) {
		
		int sum = 0;
		while(num> 0) {
			sum=sum+num%10;
			num=num/10;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num == sumOfDigits(num*num)) {
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not a Neon Number");
		}
		

	}

}
