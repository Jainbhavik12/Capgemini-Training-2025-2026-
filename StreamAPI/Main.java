package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		al.stream()
		.forEach(System.out::println);
		
		List<String> names = Arrays.asList("Bhavik", "Nithin", "Laxman", "Sai", "Suswanth");
		names.stream().forEach(System.out::println);
		
		//count
		long count = names.stream().count();
		System.out.println(count);
		
		//filter
		names.stream().filter(s->s.length()>5).forEach(System.out::println);
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4 ,5, 6 ,7, 8, 9, 10, 55);
		nums.stream().filter(n->n%2==0).forEach(System.out::println);
		
		System.out.print(nums+" ");
		System.out.println();
		//map
		List<Integer> doubledList = nums.stream().map(n->2*n).collect(Collectors.toList());
		System.out.print(doubledList+" ");
		System.out.println();
		
		List<String> upperNames = names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.print(upperNames+" ");
		System.out.println();
		
		List<Integer> li = nums.stream().map(n->n%2==0?n*2:n*3).collect(Collectors.toList());
		System.out.print(li+" ");
		System.out.println();
		
		
		
	}

}
