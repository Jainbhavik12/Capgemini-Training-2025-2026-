package collectionFramework;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque q = new ArrayDeque();
		q.offer(10);
		q.offer(20);
		q.offer("Helo");
		q.offerFirst(5);
		q.offerLast(56);
		q.offer(10);
		
		System.out.println(q);
		System.out.println(q.poll());
		q.pollLast();
		System.out.println(q);

	}

}
