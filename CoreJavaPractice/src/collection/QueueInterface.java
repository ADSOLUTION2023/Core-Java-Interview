package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		Queue q = new PriorityQueue();
		q.offer(10);
		q.add(20);
		q.offer(30);

		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.remove(20));
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.remove(20));
		System.out.println(q.addAll(q));

	}

}
