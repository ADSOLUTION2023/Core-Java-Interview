package JavaBasic;

public class objectWithoutNewKeyword {

	public void display() {
		System.out.println("Object created using Class.forName() and newInstance()");
	}

	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("JavaBasic.objectWithoutNewKeyword");
			objectWithoutNewKeyword ob = (objectWithoutNewKeyword) clazz.getDeclaredConstructor().newInstance();
			ob.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
