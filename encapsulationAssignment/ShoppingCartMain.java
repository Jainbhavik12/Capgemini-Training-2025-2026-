package encapsulationAssignment;

public class ShoppingCartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart s1 = new ShoppingCart();
		s1.addItem("Pen", 2, 40);
		System.out.println(s1.getTotalPrice());
		
		s1.removeItem("Pen", 1, 40);
		System.out.println(s1.getTotalPrice());

	}

}
