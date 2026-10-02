package collection;

public class ComparatorPOJO {
	private int id;
	private String name;
	private int salary;


	public ComparatorPOJO(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}

}

