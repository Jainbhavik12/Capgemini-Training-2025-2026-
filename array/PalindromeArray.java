package array;

import java.util.Scanner;

public class PalindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int start = 0;
		int end = n-1;
		while(start<end) {
			if(arr[start] == arr[end]) {
				start++;
				end--;
			}
			else {
				System.out.println("Not a palindrome array");
				break;
			}
		}
		if(start==end) {
			System.out.println("Palindrome Array");
		}
		

	}

}
