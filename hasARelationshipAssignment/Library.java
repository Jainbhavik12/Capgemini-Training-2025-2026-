package hasARelationshipAssignment;

public class Library {
	Book b1, b2, b3, b4;
	
	Library(Book b1, Book b2, Book b3, Book b4){
		this.b1 = b1;
		this.b2=b2;
		this.b3=b3;
		this.b4=b4;
	}
	
	public void displayDetails() {
		System.out.println(b1.title+ "Details: ");
		System.out.println("Id: "+b1.bookId);
		System.out.println("Title: "+b1.title);
		System.out.println("Author: "+b1.author);
		System.out.println();
		
		System.out.println(b2.title+ "Details: ");
		System.out.println("Id: "+b2.bookId);
		System.out.println("Title: "+b2.title);
		System.out.println("Author: "+b2.author);
		System.out.println();
		
		System.out.println(b3.title+ "Details: ");
		System.out.println("Id: "+b3.bookId);
		System.out.println("Title: "+b3.title);
		System.out.println("Author: "+b3.author);
		System.out.println();
		
		System.out.println(b4.title+ "Details: ");
		System.out.println("Id: "+b4.bookId);
		System.out.println("Title: "+b4.title);
		System.out.println("Author: "+b4.author);
		System.out.println();
	}

}
