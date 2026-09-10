package JavaBasic;

public class LamdaFunction {

		public static void main(String[] args) {
			FunctionalInt f = (a, b) -> {
				return a + b;
			};
			int a = 10;
			int b = 20;
			System.out.println("Sum" + f.sum(a, b));

			f.sub(a, b);

			FunctionalInt.multi(a, b);
		}

	}




