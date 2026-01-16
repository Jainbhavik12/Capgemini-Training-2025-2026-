package array;

import java.util.Scanner;

public class ArmstrongElement {
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
	public static boolean isArmstrong(int num) {
		int temp = num;
		int sum =0;
		int count = countDigits(num);
		while(num>0) {
			sum = sum+multiplyCountTimes(num%10, count);
			num=num/10;
			
		}
		return temp==sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			if(isArmstrong(arr[i])) {
				System.out.println(arr[i]);
			}
	}

}
}
