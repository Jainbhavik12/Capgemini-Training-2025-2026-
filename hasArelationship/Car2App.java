package hasArelationship;

public class Car2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 c = new Car2();
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("CEAT"));
		c.addTyre(new Tyre("Appolo"));
		c.addTyre(new Tyre("MRF"));
		for(Tyre tyre : c.getTyres())
			System.out.print(tyre.getBrand()+" ");
	}

}
