package array;

import java.util.Scanner;

public class InsertElementAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n+1];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter index: ");
		int index = sc.nextInt();
		System.out.println("Enter element: ");
		int element = sc.nextInt();
		
		for(int i=0; i<index; i++) {
			arr1[i] = arr[i];
		}
		arr1[index] = element;
		for(int i=index; i<n; i++) {
			arr1[i+1] = arr[i]; 
		}
		
		for(int i: arr1) {
			System.out.print(i+" ");
		}
		

	}

}
