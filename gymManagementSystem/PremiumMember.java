package gymManagementSystem;

public class PremiumMember extends Member implements DietPlanReciever{
	
	String packageType;
	Trainer trainer;
	double discountPercent;
	double baseFee;
	double finalFee;
	boolean dietAssigned = false;
	public PremiumMember(int id, String name, int age, String phone, double height, double weight,
			int membershipMonths, String packageType,Trainer trainer,double discountPercent, 	double baseFee) {
		super(id, name, age, phone, height, weight, membershipMonths);
		this.packageType=packageType;
		this.trainer=trainer;
		this.discountPercent=discountPercent;
		this.baseFee=baseFee;
	}
	
	public void calculateFee() {
		finalFee = baseFee - (baseFee*discountPercent/ 100);
	}
	 @Override
	public void receiveDietPlan() {
	    dietAssigned = true;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("Package: "+packageType);
		System.out.println("Assigned Trainer: "+trainer.name);
		calculateFee();
		System.out.println("Final Fee After Discount: "+finalFee);
		receiveDietPlan();
		System.out.println("Diet Plan Asigned: "+ (dietAssigned  ? "Yes":"NO"));
		
	}
	public void shoeRole() {
		System.out.println("I am a Premium Member");
	}
	
}
