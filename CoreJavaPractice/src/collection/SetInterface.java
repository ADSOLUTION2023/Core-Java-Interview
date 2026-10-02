package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		 HashSet h = new HashSet();
		 h.add(10);
		 h.add(20);
		 h.add(30);
		 h.add("ram");
		 
		 System.out.println(h.contains("ram"));
		 System.out.println(h.containsAll(h));
		 System.out.println(h.isEmpty());
		 System.out.println(h.size());
		 System.out.println(h.remove(10));
		 System.out.println(h);
		 System.out.println(h.retainAll(h));
		 
		 
		 System.out.println("-------------------------------------------------------------------");
		 
		 TreeSet t = new TreeSet();
		 t.add(10);
		 t.add(40);
		 t.add(20);
		 t.add(30);
		 
		 System.out.println(t.contains(20));
		 System.out.println(t.ceiling(10));
		 System.out.println(t.first());
		 System.out.println(t.pollFirst());
		 System.out.println(t.pollLast());
		 System.out.println(t.size());
		 
		 System.out.println("---------------------------------------------------------------------");
		 
		 LinkedHashSet l = new LinkedHashSet();
			l.add(1);
			l.add(2);
			l.add(3);
			l.add(4);
			l.add(4);

			System.out.println(l.contains(2));
			System.out.println(l.isEmpty());
			System.out.println(l.size());
			System.out.println(l.remove(4));
			System.out.println(l);
			System.out.println(l.hashCode());
			System.out.println(l.toArray()); 

	}

}
