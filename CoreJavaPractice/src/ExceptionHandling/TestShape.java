package ExceptionHandling;

public class TestShape {

	public static void main(String[] args) {
		
		
		try {
			
			Shape s = new Rectangle();

			Circle r =  (Circle) s;
			
		} catch (ClassCastException e) {
			System.out.println(e);
		}

	}

}
