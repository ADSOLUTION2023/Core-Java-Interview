package practice1;

public class ReverseAtSame1 {

	public static void main(String[] args) {

		String s = "Hello World";

		String[] r = s.split(" ");

		for (String t : r) {

			String rev = "";

			for (int i = t.length() - 1; i >= 0; i--) {
				rev = rev + t.charAt(i);
			}

			System.out.print(rev + " ");
		}
	}

}
