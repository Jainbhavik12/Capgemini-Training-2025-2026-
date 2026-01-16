package encapsulation;

public class Product {
	private int price;

	public void setPrice(int price) {
		
		if(price > 0) {
			this.price = price;
		}
	}
	public int getPrice() {
		
		return price;
	}
	

}
