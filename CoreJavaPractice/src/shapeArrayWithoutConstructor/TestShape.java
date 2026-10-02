package shapeArrayWithoutConstructor;

public class TestShape {

	public static void main(String[] args) {
		
		Shape[] s = new Shape[2];
		s[0] = new Circle();
		s[1] = new Rectangle();

		Circle c = (Circle) s[0];
		c.setR(2.12);
		System.out.println("Area of Circle:" + s[0].area());

		Rectangle r = (Rectangle) s[1];
		r.setLength(10);
		r.setBreadth(10);
		System.out.println("Area of Rectangle:" + s[1].area());

		String a = Area(s);
		System.out.println(a);

	}

	public static String Area(Shape[] s) {
		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {
			totalArea = totalArea + s[i].area();
		}
		return "Total Area: " + totalArea;
	}

}



