package abstractionAssignment;

public class PaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment p1 = new UPIPayment();
		p1.processPayment(50000);
		p1.printReceipt();
		
		Payment p2 = new NetBankingPayment();
		p2.processPayment(6586);
		p2.printReceipt();

	}



}
