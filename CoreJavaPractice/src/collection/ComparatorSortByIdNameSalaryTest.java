package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparatorSortByIdNameSalaryTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List l = new ArrayList();

		l.add(new ComparatorPOJO("a", 3, 2000));
		l.add(new ComparatorPOJO("y", 1, 1000));
		l.add(new ComparatorPOJO("b", 2, 3000));
		l.add(new ComparatorPOJO("c", 1, 5000));
		l.add(new ComparatorPOJO("t", 3, 3000));

		Iterator iti1 = l.iterator();
		while (iti1.hasNext()) {
			System.out.println(iti1.next());
		}
		ComparatorSortByAll c1 = new ComparatorSortByAll();
		Collections.sort(l, c1);
		System.out.println("SortBy  Id Name Salary>>>");
		Iterator iti = l.iterator();
		while (iti.hasNext()) {
			System.out.println(iti.next());
		}
	}
}

