package MapHirarechy;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap map = new LinkedHashMap();
		
		map.put(10, "Bhavik");
		map.put(20, "Shivam");
		map.put(30, "bhj");
		
		System.out.println(map);
		
		for(Object o: map.entrySet()) {
			System.out.println(o);
		}
		for(Object o: map.keySet()) {
			System.out.println(o);
		}
		for(Object o: map.values()) {
			System.out.println(o);
		}
		System.out.println(map.get(4));
		
		

	}

}
