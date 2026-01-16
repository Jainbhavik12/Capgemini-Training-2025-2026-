package decisionMakingStatements;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'i' ||ch == 'O' ||ch == 'U') {
			System.out.println(ch+" is a vowel");
		}
		else {
			System.out.println(ch+" is a consonent");
		}

	}

}
