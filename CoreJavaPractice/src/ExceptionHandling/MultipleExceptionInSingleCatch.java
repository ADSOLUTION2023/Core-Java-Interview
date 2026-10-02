package ExceptionHandling;

public class MultipleExceptionInSingleCatch {

	public static void main(String[] args) {
		int i = 10;
		String s = null;
		try {
			int j = i / 1;
			System.out.println(s.charAt(3));
		} catch (ArithmeticException | NullPointerException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}
}
