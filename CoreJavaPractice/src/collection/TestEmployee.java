package collection;

import java.util.ArrayList;
 
import java.util.Collections;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<>();
		l.add(new Employee(1, "Amit", 1200));
		l.add(new Employee(2, "Raj", 1100));
		l.add(new Employee(3, "Anil", 1200));
		l.add(new Employee(4, "Ajit", 1200));

		System.out.println("Before Sorting:");
		System.out.println(l);

		Collections.sort(l);

		System.out.println("After Sorting:");
		System.out.println(l);

	}

}
