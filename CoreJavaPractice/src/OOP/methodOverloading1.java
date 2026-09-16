package OOP;

public class methodOverloading1 {

	public void name(String name) {
		System.out.println("What is Your Name?");

	}

	public void name(String name, String lastName) {
		System.out.println("My Name is:" + name + " Last Name is :" + lastName);
	}

	public void name(int age) {
		System.out.println("and My age is:" + age);
	}

	public static void main(String[] args) {
		methodOverloading1 mo = new methodOverloading1();
		mo.name("Amit");
		mo.name("Amit", "Chandsarkar");
		mo.name(30);

	}
}
