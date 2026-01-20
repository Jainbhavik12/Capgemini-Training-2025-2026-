package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class MainBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		Book b1 = new Book("java", 200);
		Book b2 = new Book("C++", 250);
		Book b3 = new Book("Python", 150);
		Book b4 = new Book("Machine Learninng", 2000);
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		
		Collections.sort(al);
		System.out.println(al);

	}

}
