package abstractionAssignment;

public class CurrentAccount extends BankAccount{
	public double calculateIntrest() {
		// TODO Auto-generated method stub
		int intrestRate = 9;
		return super.getBalance()*(1+intrestRate);
	}

}
