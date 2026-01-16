package bankingManagementSystem;

public class SavingsAccount extends Account{
	private double intrestRate;
	
	public SavingsAccount(int accountNumber, String accountHolderName, double balance, double intrestRate) {
		super(accountNumber, accountHolderName, balance);
		this.intrestRate=intrestRate;
	}

	@Override
	public void withdraw(double amount) {
		if(amount > balance) {
			addTransaction("Failed Withdrawal", amount);
			System.out.println("Insufficient Balance");
		}
		else {
			balance-=amount;
			  addTransaction("Withdrawal", amount);
			System.out.println("₹"+amount+" debited from your account");
		}
		
	}
	
	public double calculateIntrest() {
		 double interest = balance * intrestRate / 100.0;
	     addTransaction("Interest added", interest);
	     return interest;
	}
	
	

	

}
