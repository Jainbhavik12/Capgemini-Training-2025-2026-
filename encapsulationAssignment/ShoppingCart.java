package encapsulationAssignment;

public class ShoppingCart {
	private double totalPrice;
	
	public void addItem(String itemName, int quantity, double itemPrice) {
		if(quantity<=0 || itemPrice < 0) {
			System.out.println("Select Quantity");
		}
		else {
			System.out.println("You have added "+quantity+ " " +itemName+" in the cart");
			totalPrice = totalPrice + itemPrice*quantity;
		}
		
	}
	
	public void removeItem(String itemName, int quantity, double itemPrice) {
		System.out.println("You have removed "+quantity+ " " +itemName+" in the cart");
		totalPrice = totalPrice - itemPrice*quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
		
	}

}
