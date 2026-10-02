package collection;

public class ComparablePOJO implements Comparable<ComparablePOJO> {

	private int id;
	private String name;

	public ComparablePOJO(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(ComparablePOJO o) {

		if (this.name.equals(o.name)) {

			return this.id - o.id;

		} else {

			return this.name.compareTo(o.name); 

		}
	}

	@Override
	public String toString() {
		return id + " " + name;
	}

}

