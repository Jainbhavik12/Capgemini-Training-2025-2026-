package bankingManagementSystem;

public class CurrentAccount extends Account{
	private double overDraftLimit;

	public CurrentAccount(int accountNumber, String accountHolderName, double balance, double overDraftLimit) {
		super(accountNumber, accountHolderName, balance);
		this.overDraftLimit=overDraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		if(balance+overDraftLimit < amount) {
			 System.out.println("Overdraft limit exceeded!");
	         addTransaction("Failed Overdraft Withdrawal", amount);
		}
		else {
			balance-=amount;
            addTransaction("Overdraft Withdrawal", amount);
            System.out.println("₹"+amount+" debited from your account");
		}
		
	}
	
	

}
