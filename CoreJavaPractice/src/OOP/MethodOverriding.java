package OOP;

class Parent {
	public int sum(int a, int b) {
		return a + b;
	}
}

public class MethodOverriding extends Parent {
	@Override
	public int sum(int a, int b) {
		return a + b + 100;

	}

	public static void main(String[] args) {
		MethodOverriding m = new MethodOverriding();
		System.out.println(m.sum(10, 20));

	}
}
