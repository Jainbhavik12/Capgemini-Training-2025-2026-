package loopingStatements;

import java.util.Scanner;

public class WelcomeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		char ch = 'Y';
		
		
		do{
			System.out.println("Welcome!! \nDo you want to print this again Y or N?");
			ch = sc.next().charAt(0);
		}
		
		while(ch == 'Y');
		

	}

}
