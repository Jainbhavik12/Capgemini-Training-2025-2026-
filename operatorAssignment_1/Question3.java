package operatorAssignment_1;

public class Question3 {
	
	public static void main(String[] args) {
		
		int rating = 4;
		int yearsOfExperience = 6;
		boolean isDeciplinaryAction = true;
		int salary = 50000;
		
		boolean isEligibleForPromotion = (rating > 4 || yearsOfExperience > 5) && !isDeciplinaryAction ? true : false;
		
		salary = isEligibleForPromotion ? salary + salary / 10 : salary;
		
		System.out.println("Your salary is "+salary);
		
		
	}

}
