package encapsulationAssignment;

public class BankAccount {
	private String accountNumber;
	private int balance = 0;
	
	public BankAccount(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("₹"+ amount+" Credited in your account");
	}
	public void withdraw(int amount) {
		if(amount > balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			balance -= amount;
			System.out.println("₹"+amount+" Debited from your account");
		}
		
	}
	public int getBalance() {
		return balance;
	}

}
