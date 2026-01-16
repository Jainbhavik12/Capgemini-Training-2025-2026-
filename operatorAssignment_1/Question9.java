package operatorAssignment_1;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int units = 250;
		boolean isCommercialUser = true;
		int bill = 0;
		
		bill = units > 250 || isCommercialUser ? units * 10 : bill;
		
		System.out.println("You have to pay amount Rs. " + bill);

	}

}
