package encapsulationAssignment;

public class Book {
	private double price;
	
	public void setPrice(double price) {
		if(price < 0) {
			System.out.println("Price can't be negative");
		}
		else {
			this.price = price;
			System.out.println("Price updated successfully");
		}
		
	}
	
	public double getPrice() {
		return price;
	}
	

}
