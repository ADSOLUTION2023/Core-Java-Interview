package ExceptionHandling;

public class Circle extends Shape {

	int radius;
	final double PI = 3.14;

	@Override
	public double Area() {
		return PI * radius * radius;
	}
}