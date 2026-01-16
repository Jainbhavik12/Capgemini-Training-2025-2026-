package abstractionAssignment;

public class NetBankingPayment extends Payment{
	@Override
	public void processPayment(double amount) {
		System.out.println("Payment ₹"+amount+" is done through Net Banking");
	}

}
