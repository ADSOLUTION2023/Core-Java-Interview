package ExceptionHandling;

public class Rectangle extends Shape {
	int length;
	int breadth;

	@Override
	public double Area() {
		return length * breadth;
	}
}