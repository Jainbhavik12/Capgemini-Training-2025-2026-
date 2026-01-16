package operatorAssignment_1;

public class Question4 {

	public static void main(String[] args) {
		 boolean isPremium = true;
		 double billAmount = 1500;
		 boolean isFirstCustomer = true;
		 
		 boolean willGetDiscount = (billAmount > 2000 && isPremium) || isFirstCustomer ? true : false;
		 
		 billAmount = willGetDiscount ? billAmount - (billAmount * 0.05) : billAmount; 
		 
		 System.out.println(billAmount);

	}

}
