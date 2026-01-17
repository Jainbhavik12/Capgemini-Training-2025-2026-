package collectionFramework;
import java.util.*;

public class AddingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l1 = new ArrayList();
		l1.add(15);
		l1.add(25);
		l1.add(18);
		l1.add(5);
//		l1.add(null);
//		l1.add("List Item");
		System.out.println(l1);
		
		ArrayList l2 = new ArrayList();
		l2.add(50);
		l2.add(60);
		l2.add(3);
		l2.addAll(l1);
		
		System.out.println(l2);
		
		l1.add(4, 49);
		System.out.println(l1);
		
		l1.addAll(0, l2);
		System.out.println(l1);
		

	}

}
