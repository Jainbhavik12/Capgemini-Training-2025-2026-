package gymManagementSystem;

import java.time.LocalDate;

public class Member extends Person{
	
	double height;
	double weight;
	int membershipMonths;
	double bmi;
	public Member(int id, String name, int age, String phone, double height, double weight, int membershipMonths) {
		super(id, name, age, phone);
		this.height=height;
		this.weight=weight;
		this.membershipMonths=membershipMonths;
	}
	
	
	public void calculateBMI() {
		bmi = weight / Math.pow(height/100, 2);
	}
	public LocalDate calculateExpiryDate() {
		return LocalDate.now().plusMonths(membershipMonths);
	}
	
	public void getDetails() {
		
		super.getDetails();
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        calculateBMI();
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Membership Expires On: " + calculateExpiryDate());
	}
	public void showRole() {
        System.out.println("Role: I am a Member");
    }
	
}
