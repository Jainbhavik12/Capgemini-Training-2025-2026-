package methodOverriding;

import java.util.Scanner;

public class ATM {
	private int pin;
	private String password = "123456";
	
	public void changePin(int newPin) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password: ");
		String userInputPass = sc.next();
		if(password.equals(userInputPass)) {
			pin = newPin;
		}
		else {
			System.out.println("Incorrect Password");
		}
	}
	public int getPin() {
		return pin;
	}

}
