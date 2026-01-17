package telecomRechargeSystem;

public class Recharge {
	private int amount;
	
	Recharge(int amount){
		this.amount=amount;
		System.out.println("Base recharge initialized: "+this.amount);
	}
	public int getAmount() {
		return amount;
	}

}
