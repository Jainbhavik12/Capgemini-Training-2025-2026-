package gymManagementSystem;

public class Main {

	public static void main(String[] args) {
		System.out.println("---Member Details---");
		Member m1 = new Member(1, "Bhavik", 20, "7249548496", 170.0, 83.0, 5);
		m1.getDetails();
		m1.showRole();
		System.out.println();
		
		System.out.println("---Trainer Details---");
		Trainer t1 = new Trainer(2, "Mohit", 35, "1234567890","Weight Loss", 200.0, 100);
		t1.getDetails();
		t1.showRole();
		System.out.println();
		
		System.out.println("---Premium Member Details---");
		PremiumMember pm2 = new PremiumMember(3,"Nithin", 23, "5647912350", 165,75, 12, "Gold", t1,10, 12000);
		pm2.getDetails();
		pm2.shoeRole();

	}

}
