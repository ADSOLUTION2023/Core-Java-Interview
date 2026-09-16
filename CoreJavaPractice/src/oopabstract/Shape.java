package oopabstract;

abstract class Shape {

	abstract void area();

}

class Circle extends Shape {

	int r;
	static final double PI = 3.14;

	Circle(int r) {
		this.r = r;
	}

	@Override
	void area() {
		double area = PI * r * r;
		System.out.println("Area of circle:" + area);

	}

}

class Rectangle extends Shape {

	int l;
	int b;

	Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

	@Override
	void area() {
		double area = l * b;
		System.out.println("Area of Rectangle:" + area);

	}
}

