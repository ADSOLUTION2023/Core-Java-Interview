package shapeArrayWithMethodReturn;

public class Rectangle extends Shape {
	public int length;
	public int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double area() {
		return length * breadth;
	}
}
