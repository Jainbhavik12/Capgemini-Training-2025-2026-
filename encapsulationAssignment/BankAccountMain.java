package encapsulationAssignment;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount("SBI32589648");
		b1.deposit(50000);
		b1.withdraw(5000);
		System.out.println(b1.getBalance());

	}

}
