package abstractionAssignment;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount b1 = new SavingsAccount();
		b1.deposit(2000);
		b1.calculateIntrest();
		b1.withdraw(200);

	}

}
