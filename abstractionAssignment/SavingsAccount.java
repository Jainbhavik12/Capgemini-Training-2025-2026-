package abstractionAssignment;

public class SavingsAccount extends BankAccount{

	@Override
	public double calculateIntrest() {
		// TODO Auto-generated method stub
		int intrestRate = 6;
		
		return super.getBalance()*(1+intrestRate);
	}

}
