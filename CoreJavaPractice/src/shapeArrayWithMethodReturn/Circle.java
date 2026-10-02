package shapeArrayWithMethodReturn;


public class Circle extends Shape{

	public double r;
	public final double PI = 3.14;

	public Circle(double r) {
		this.r = r;
	}

	public double area() {
		return PI * r * r;

	}
}
