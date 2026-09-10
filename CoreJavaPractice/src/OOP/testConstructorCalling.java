package OOP;

public class testConstructorCalling extends constructorCalling {

	public testConstructorCalling(String fName, String lName, String Address) {
		super(fName, lName, Address);
		
	}

	public static void main(String[] args) {
	 
		testConstructorCalling tc = new testConstructorCalling("Amit", "Soni", "Indore");
		
		 

	}

}
