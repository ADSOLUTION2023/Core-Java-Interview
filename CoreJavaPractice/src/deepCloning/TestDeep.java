package deepCloning;

public class TestDeep {

	public static void main(String[] args) throws CloneNotSupportedException {
		 Customer c = new Customer("Amit");
		 Customer c1 = (Customer) c.clone();
		 c1.name = "Advait";
		 c1.no.balance = 20000;
		 
		 
		 System.out.println(c.name);
		 System.out.println(c.no.balance);
		 
		 System.out.println(c1.name);
		 System.out.println(c1.no.balance);
	}

}
