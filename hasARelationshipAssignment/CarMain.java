package hasARelationshipAssignment;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine E = new Engine("Diesel", 10000);
		Car c1 = new Car("Ford", "Mustang", E);
		c1.displayDetails();

	}

}
