package MapHirarechy;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap map = new HashMap();
		map.put(1, "Bhavik");
		map.put(2, "Nithin");
		map.put(3,  "Shivam");
		map.put(4,  "Devendra");
		map.put(5, "Narendra");
		
		map.putIfAbsent(4, "Eknath");
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		
		
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
