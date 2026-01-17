package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AccessElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		System.out.println(a);
		System.out.println(a.get(0));
		
		for(int i=0; i<a.size(); i++) {
			System.out.print(a.get(i)+" ");
		}
		System.out.println();
		
		for(Object o : a) {
			System.out.print(o+" ");
		}
		System.out.println();
		
		Iterator i = a.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
		ListIterator li = a.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println();
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}
		System.out.println();
		
		ListIterator li1 = a.listIterator(2);
		
		while(li1.hasPrevious()) {
			System.out.print(li1.previous()+" ");
		}
		li1 = a.listIterator(2);
		while(li1.hasNext()) {
			System.out.print(li1.next()+" ");
		}
		
		
	}

}
