package collectionFramework;

public class Book implements Comparable{
	String title;
	int price;
	Book(String title, int price){
		this.title=title;
		this.price=price;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Book b = (Book)o;
		return b.price - this.price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	

}
