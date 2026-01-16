package bankingManagementSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
	private int accountNumber;
	private String accountHolderName;
	protected double balance;
	
	protected List<Transaction> history = new ArrayList<>();
	
	public Account(int accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		
		addTransaction("Account Opened", balance);
	}
	
	
	public void deposit(double amount) {
		if(amount < 0) {
			System.out.println("Invalid Amount!");
		}
		else {
			balance+=amount;
			addTransaction("Deposit", amount);
			System.out.println("₹"+amount+" credited in your account");
		}
	}
	
	//abstact method
	public abstract void withdraw(double amount);
	
	public void transfer(Account toAcc, double amount) {
        this.withdraw(amount);
        toAcc.deposit(amount);
        addTransaction("Transfer to " + toAcc.getAccountNumber(), amount);
    }
	
	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	protected void addTransaction(String type, double amount) {
	       history.add(new Transaction(type, amount));
	}
	
	public void showHistory() {
        System.out.println("\nTransaction History for Account " + accountNumber + ":");
        for (Transaction t : history) {
            t.printDetails();
        }
    }

}
