package methodOverriding;

public class EmployeeTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.setName("Amit");
		m.setSalary(150000);
		m.calculateSalary(20.0);

		Developer d = new Developer();
		d.setName("Shushant");
		d.setSalary(20000);
		d.calculateSalary(12);
	}

}
