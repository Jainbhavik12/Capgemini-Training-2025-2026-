package abstractionAssignment;

public abstract class BankAccount {
	
	private double balance;
	
	public abstract double calculateIntrest();
	
	public void withdraw(int amount) {
		if(amount > balance) {
			System.out.println("Insufficient Balance!");
		}
		else {
			balance=balance-amount;
		}
	}
	public void deposit(int amount) {
		if(amount <= 0) {
			System.out.println("Invalid Amount");
		}
		else {
			balance = balance+amount;
		}
	}
	public double getBalance() {
		return balance;
	}

}
