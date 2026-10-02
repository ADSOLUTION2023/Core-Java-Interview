package shapeArrayWithoutConstructor;

public class Rectangle extends Shape {
	
	public int length;
	public int breadth;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	@Override
	public double area() {
		return length*breadth;
	}

}
