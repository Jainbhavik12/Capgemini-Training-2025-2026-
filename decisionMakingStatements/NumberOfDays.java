package decisionMakingStatements;

import java.util.Scanner;

public class NumberOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String month = sc.nextLine();
		
		switch(month) {

		case "January":
			System.out.println("31 Days");
			break;
		case "February":
			System.out.println("28 Days");
			break;
		case "March":
			System.out.println("31 Days");
			break;
		case "April":
			System.out.println("30 Days");
			break;
		case "May":
			System.out.println("31 Days");
			break;
		case "June":
			System.out.println("30 Days");
			break;
		case "July":
			System.out.println("31 Days");
			break;
		case "August":
			System.out.println("31 Days");
			break;
		case "September":
			System.out.println("30 Days");
			break;
		case "October":
			System.out.println("31 Days");
			break;
			
		case "November":
			System.out.println("30 Days");
			break;
		case "Decenber":
			System.out.println("31 Days");
			break;
		}

	}

}
