package telecomRechargeSystem;

public class DataRecharge extends Recharge{
	private int amount;
	
	
	DataRecharge(int baseAmount, int dataAmount){
		super(baseAmount);
		this.amount=dataAmount;
		System.out.println("Data pack added: " + dataAmount);
	}
	
	public int getAmount() {
		int total = super.getAmount() + amount;
		System.out.println("Amount after data pack: " + total);
        return total;
	}

}
