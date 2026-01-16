package basic;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter youe name: ");
		String name = sc.nextLine();
		System.out.println("Enter youe Mobile number: ");
		String mobnum = sc.nextLine();
		
		System.out.println("Enter youe registration number: ");
		String regno = sc.nextLine();
		
		
		System.out.println("Enter youe Age: ");
		int age = sc.nextInt();
		
		
		
		
		
		
		
		
		System.out.println("Verify your information");
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Mobile Number: "+ mobnum);
		System.out.println("Registration Number: "+ regno);
		

	}

}
