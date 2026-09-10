
public class constructorCalling {
	String fName;
	String lName;
	String Address;
	
	public constructorCalling(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		System.out.println(fName);
		System.out.println(lName);
		 
	}
	public constructorCalling(String fName, String lName, String Address) {
		this(fName,lName);
		this.Address = Address;
		System.out.println(Address);
	
	}

}
