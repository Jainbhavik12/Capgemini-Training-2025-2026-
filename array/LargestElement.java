package array;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int largest = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);

	}

}
