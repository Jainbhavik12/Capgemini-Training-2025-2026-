package abstractionAssignment;

public class UPIPayment extends Payment{
	@Override
	public void processPayment(double amount) {
		System.out.println("Payment ₹"+amount+" is done through UPI");
	}

}
