package hasArelationship;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("BMW");
		System.out.println(c.getModelName());
		System.out.println(c.getEngine().getHp());
	}

}
