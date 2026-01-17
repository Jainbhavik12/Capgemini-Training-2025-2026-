package telecomRechargeSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PremiumRecharge pr = new PremiumRecharge(299, 199, 50);

	        int finalAmount = pr.calculateFinalAmount();

	        System.out.println("Payable Amount: " + finalAmount);

	}

}
