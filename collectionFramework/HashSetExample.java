package collectionFramework;

import java.util.Collections;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(null);
		Book b1 = new Book("java", 200);
		Book b2 = new Book("C++", 250);
		Book b3 = new Book("Python", 150);
		Book b4 = new Book("Machine Learninng", 2000);
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		
		System.out.println(set);
		
		System.out.println(set.contains(20));
		
		for(Object o : set) {
			System.out.println(o);
		}
		
		System.out.println(set);
		
	}

}
