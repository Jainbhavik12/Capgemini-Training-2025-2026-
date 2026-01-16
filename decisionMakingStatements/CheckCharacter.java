package decisionMakingStatements;

import java.util.Scanner;

public class CheckCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if((int)ch >= 97 && (int)ch <= 122){
			System.out.println("Lower Case");
		}
		else if((int)ch >= 65 && (int)ch<=90) {
			System.out.println("Upper Case");
			
		}
		else if((int)ch >= 48 && (int)ch <= 57) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}

	}

}
