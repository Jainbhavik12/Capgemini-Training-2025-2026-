package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 2, 2, 3, 3, 4};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
        

	}

}
