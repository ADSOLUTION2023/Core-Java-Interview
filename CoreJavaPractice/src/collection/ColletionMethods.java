package collection;

import java.util.ArrayList;
import java.util.Collection;

public class ColletionMethods{
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Collection c1 = new ArrayList();
		
		c1.add(1);
		c1.add(20);
		c1.add(10);
		c.add(20);
		c.add(31);
		c.add(25);
		/*
		 * System.out.println(c.add(10)); System.out.println(c.addAll(c));
		 * 
		 * System.out.println(c.size()); System.out.println(c.contains(10));
		 * System.out.println(c + "con"); System.out.println(c.containsAll(c));
		 * System.out.println(c.isEmpty()); System.out.println(c.remove(31));
		 * System.out.println(c.removeAll(c)); System.out.println(); c.clear();
		 */
		System.out.println(c.retainAll(c1));

	}

}
