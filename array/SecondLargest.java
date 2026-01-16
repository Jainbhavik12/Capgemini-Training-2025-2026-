package array;

import java.util.Scanner;

public class SecondLargest {
	public static int largestIndex(int[] arr) {
	
		int n = arr.length;
		
		
		int largest = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] > arr[largest]) {
				largest = i;
			}
		}
		return largest;
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
		arr[largestIndex(arr)] = Integer.MIN_VALUE;
		
		int secondLargestIndex = largestIndex(arr);
		
		System.out.println(arr[secondLargestIndex]);

	}

}
