package collection;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int compareTo(Employee e) {
		if (this.salary < e.salary) {
			return -1;
		} else if (this.salary > e.salary) {
			return 1;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
