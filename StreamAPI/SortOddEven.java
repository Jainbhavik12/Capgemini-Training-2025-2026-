package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7,8 ,9 ,10);
		
		List<Integer> even = nums.stream().filter(n->n % 2==0).collect(Collectors.toList());
		List<Integer> odd = nums.stream().filter(n->n % 2!=0).collect(Collectors.toList());
		System.out.println(even);
		System.out.println(odd);
		
		Map<Boolean, List<Integer>> oddEvenNumbersMap = 
                nums.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		
		for(Boolean b : oddEvenNumbersMap.keySet()) {
			
			
			System.out.println(oddEvenNumbersMap.get(b));
		}
		
	}

}
