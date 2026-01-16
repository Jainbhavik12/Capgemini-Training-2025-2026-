package methodOverriding;

public class ATMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM atm = new ATM();
		atm.changePin(4568);
		System.out.println(atm.getPin());

	}

}
