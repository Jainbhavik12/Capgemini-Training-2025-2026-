package array;

import java.util.Scanner;

public class AveargeOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<n; i++) {
			
				sum+=arr[i];
			
		}
		int average = sum/n;
		System.out.println(average);


	}

}
