package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		System.out.println(l.add(50));
		System.out.println(l);
		System.out.println(l.get(3));
		System.out.println(l.hashCode());
		System.out.println(l.indexOf(20));
		System.out.println(l.subList(1, 4));
		System.out.println(l.lastIndexOf(40));
		
		
		System.out.println("----------------------------------------------------------------------------");
		
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		System.out.println(ll.element());
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.offer(20));
		System.out.println(ll.offerFirst(3));
		System.out.println(ll.offerLast(2));
		System.out.println(ll.remove());
		System.out.println(ll);
		
		
		System.out.println("-----------------------------------------------------------------------------");
		
		Stack s = new Stack();
		
		s.push(1);
		s.add(2);
		s.push(3);
		s.add(4);
		
		System.out.println(s.empty());
		System.out.println(s.peek());
		System.out.println(s.search(4));
		System.out.println(s.pop());
		System.out.println(s.capacity());
		System.out.println(s);
		System.out.println(s.remove(3));
		System.out.println(s);
		
		System.out.println("----------------------------------------------------------------------------");
		
		Vector v = new Vector();
		
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		
		System.out.println(v.elementAt(3));
		System.out.println(v.subList(1, 3));
		System.out.println(v.hashCode());
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		
		
	}
	
	

}
