package abstractionAssignment;

public class CreditCartPayment extends Payment{

	@Override
	public void processPayment(double amount) {
		System.out.println("Payment ₹"+amount+" is done through Credit Card");
	}

}
