package numberPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static int countDigits(int num) {
		int count = 0;
		while(num> 0) {
			num=num/10;
			count++;
		}
		
		return count;
	}
	public static int multiplyCountTimes(int num, int count) {
		int prod=1;
		for(int i=1;i<=count;i++) {
			prod = prod*num;
		}
		return prod;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum =0;
		int count = countDigits(num);
		while(num>0) {
			sum = sum+multiplyCountTimes(num%10, count);
			num=num/10;
			
		}
		if(sum==temp) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}

	}

}
