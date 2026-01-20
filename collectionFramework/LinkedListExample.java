package collectionFramework;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.add(1, 15);
		list.remove(2);
		
		LinkedList list2 = new LinkedList();
		list2.add(4);
		list2.add(5);
		list2.add(7);
		
		System.out.println(list);
		System.out.println(list2);
		
		list.addAll(1, list2);
		System.out.println(list);
		
		list.retainAll(list2);
		System.out.println(list);
		
		
		list.clear();
		System.out.println(list);

	}

}
