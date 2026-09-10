package JavaBasic;

public class FirstHigh {

	public static void main(String[] args) {
		int[] a = {2, 67, 0, 56, 12, 678, 98};
		int b = a[0];
		int c = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > b) {
				c = b;
				b = a[i];
				
			}else {
				c=a[i];
			}
		}
		System.out.println(b);
		System.out.println(c);

	}

}
