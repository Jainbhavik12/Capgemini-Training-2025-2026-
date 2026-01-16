package hasARelationshipAssignment;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(1, "Wings of Fire", "Dr. A P J Abdul Kalam");
		Book b2 = new Book(2, " jlnm,.njuyvbh", "hvghhbnb");
		Book b3 = new Book(3, "cfvghbj", "xerctvybuhn");
		Book b4 = new Book(4, "gh jhj nm", "ctvghbj");
		
		Library l1 = new Library(b1, b2, b3, b3);
		l1.displayDetails();

	}

}
