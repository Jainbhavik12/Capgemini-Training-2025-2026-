package abstractionAssignment;

public abstract class Payment {
	public abstract void processPayment(double amount);
	
	public static void printReceipt() {
		System.out.println("Reciept Printing...");
	}
}
