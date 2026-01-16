package array;

import java.util.Scanner;

public class CopyArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] copy = new int[n];
		for(int i=0;i<n; i++) {
			copy[i] = arr[i];
		}
		for(int i=0;i<n; i++) {
			System.out.print(copy[i]+" ");
		}
		

	}

}
