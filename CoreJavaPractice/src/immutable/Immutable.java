package immutable;

public class Immutable {

	private final int n;

	public Immutable(int n) {
		this.n = n;
	}

	public int value() {
		return n;

	}

	public static void main(String[] args) {

		Immutable m = new Immutable(20);
		System.out.println(m.value());

	}

}
