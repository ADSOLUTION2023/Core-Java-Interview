package streamAPI;

import java.util.ArrayList;
import java.util.List;

// salary >= 20000
public class TestEmployeeSalary {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("Amit", 20000));
		list.add(new Employee("Advait", 25000));
		list.add(new Employee("raj", 1000));
		list.add(new Employee("naman", 522));
		list.add(new Employee("paras", 600));

		list.stream().distinct().filter(c -> (c.getSalary() >= 20000))
				.forEach(c -> System.out.println(c.getSalary() + "=" + c.getName()));

	}

}

