package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<5;i++) {
			arr.add(sc.nextInt());
		}
		int sum=0;
		Iterator<Integer> i = arr.iterator();
		while(i.hasNext()) {
			sum = sum+ i.next();
		}
		System.out.println(sum);

	}

}
