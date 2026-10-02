package withoutNewKeyword;

public class Example {

	public void Display() {
		System.out.println("Object created using class.forName and newInstance");
	}

	public static void main(String[] args){
		
		try {
		Class <?> clazz = Class.forName("withoutNewKeyword.Example");
		Example ex = (Example) clazz.getDeclaredConstructor().newInstance();
		ex.Display();
		
		}catch (Exception e){
			e.printStackTrace();
			
		}
	}

}


