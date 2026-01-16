package bankingManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	 private List<Account> accounts = new ArrayList<>();
	 
	 
	 public void addAccount(Account acc) {
	        accounts.add(acc);
	        System.out.println("Account added: " + acc.getAccountNumber());
	 }
	 public Account findAccount(int accNo) {
	        for (Account acc : accounts)
	            if (acc.getAccountNumber() == accNo)
	                return acc;
	        return null;
	  }
	 public void transfer(int fromAcc, int toAcc, double amt) {
	        Account a1 = findAccount(fromAcc);
	        Account a2 = findAccount(toAcc);

	        if (a1 == null || a2 == null) {
	            System.out.println("Invalid account number!");
	            return;
	        }

	        a1.transfer(a2, amt);
	        System.out.println("Transfer Completed!");
	    }


}
