package Inheritance;

public class TestEmployee {

	public static void main(String[] args) {
		 Manager m = new Manager();
		 m.setName("Amit");
		 m.setSalary(200000);
		 m.calculateSalary(20);
		 
		 Developer d = new Developer();
		 d.setName("Rakesh");
		 d.setSalary(25000);
		 d.calculateSalary(15);
	}

}
