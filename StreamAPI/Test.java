package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(60);
		al.add(30);
		al.add(40);
		al.add(70);
		
		List<Integer> l1 = al.stream().sorted().collect(Collectors.toList()) ;
		System.out.println(l1);
	}

}
