package shapeArrayWithMethodReturn;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s = new Shape();
		
		Shape s1 = Shape.getShape(1);
		Shape s2 = Shape.getShape(2);
		
		System.out.println("Area of Rectangle: " + s1.area()+ " sq. Units");
		System.out.println("Area of Circle : " + s2.area()+ " sq. Units");
		

	}
	

}
