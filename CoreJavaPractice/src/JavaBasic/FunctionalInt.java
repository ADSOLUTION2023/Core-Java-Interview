package JavaBasic;

public interface FunctionalInt {
	public int sum(int a,int b);
	
	public static void multi(int a, int b) {
		System.out.println("Multi" + a*b);
	}
	public default int sub(int a, int b) {
		System.out.println("Sub" + (a-b));
		return a-b;
	}

}
