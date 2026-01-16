package array;

import java.util.Scanner;

public class DifferenceOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int evensum=0;
		int oddSum=0;
		for(int i=0; i<n; i++) {
			if(arr[i]%2 == 0) {
				evensum+=arr[i];
			}
			else {
				oddSum+=arr[i];
			}
		}
		System.out.println(evensum - oddSum);

	}

}
