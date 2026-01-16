package operatorAssignment_1;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int balance = 5000;
		boolean isActive = true;
		int withdrawl_amount = 12000;
		
		boolean isAllowed = balance > 0 && isActive && balance >=  withdrawl_amount? true : false;
		
		String msg = isAllowed ? "You are allowed to withdraw amount" : "You are not allowed to withdraw amount";
		
		System.out.println(msg);
		
		balance = isAllowed ? balance - withdrawl_amount : balance;
		
		System.out.println("Your balance is "+balance);

		

	}

}
