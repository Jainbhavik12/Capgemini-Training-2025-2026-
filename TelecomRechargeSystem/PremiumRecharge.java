package TelecomRechargeSystem;

public class PremiumRecharge extends DataRecharge{
	int amount;
	
	PremiumRecharge(int baseAmount, int DataAmount, int tax){
		super(baseAmount, DataAmount);
		this.amount=tax;
		System.out.println("Service tax added: " + tax);
	}
	
	public int calculateFinalAmount() {
        int total = super.getAmount() + amount;
        System.out.println("Final recharge amount calculated");
        return total;
    }
}
