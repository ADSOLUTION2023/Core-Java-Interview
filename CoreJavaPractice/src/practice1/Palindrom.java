package practice1;

public class Palindrom {
	public static void main(String[] args) {
		String s = "madam2";
		String rev = "";
		
		for (int i = s.length()-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev)) {
		System.out.println("Its Palindrom");
		}else {
			System.out.println(s.length()+"Not a Palindrom");
		}
	}

}
