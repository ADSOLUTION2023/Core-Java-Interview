package shapeArrayWithoutConstructor;

public class Circle extends Shape{
	
	public double r;
	
	public final double PI = 3.14;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getPI() {
		return PI;
	}
	
	@Override
	public double area() {
		 
		return  PI*r*r;
		
	}

}
