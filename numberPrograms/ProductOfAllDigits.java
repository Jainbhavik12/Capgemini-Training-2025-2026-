package numberPrograms;

import java.util.Scanner;

public class ProductOfAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int product = 1;
		while(num > 0) {
			product = product * num%10;
			num=num/10;
			
		}
		System.out.println(product);

	}

}
