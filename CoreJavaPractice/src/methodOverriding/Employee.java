package methodOverriding;

public class Employee {
	
	private String name;
	protected int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void calculateSalary(double per) {
		System.out.println("salary");
	}

}
