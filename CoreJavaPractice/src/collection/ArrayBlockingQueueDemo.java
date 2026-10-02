package collection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueDemo {

    public static void main(String[] args) {

        BlockingQueue<Integer> q = new ArrayBlockingQueue<>(3);

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q);

        System.out.println(q.peek());

        System.out.println(q.remove());

        System.out.println(q);

        q.offer(40);

        System.out.println(q);
    }
}