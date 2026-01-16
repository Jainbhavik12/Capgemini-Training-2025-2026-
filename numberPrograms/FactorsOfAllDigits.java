package numberPrograms;

import java.util.Scanner;

public class FactorsOfAllDigits {
	
	public static void factorsOfNumber(int num) {
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num>0) {
			factorsOfNumber(num%10);
			num=num/10;
		}

	}

}
