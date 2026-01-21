package collectionFramework;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet al = new TreeSet();
		Book b1 = new Book("java", 200);
		Book b2 = new Book("C++", 250);
		Book b3 = new Book("Python", 150);
		Book b4 = new Book("Machine Learninng", 2000);
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		
		System.out.println(al);

	}

}
