package JavaBasic;

public class PalindromNo {

	public static void main(String[] args) {
		 int n1 = 121;
		 int n2 = n1;
		 int temp = 0;
		 int r = 0;
		 
		 while(n2!=0) {
			 r = n2%10;
			 temp = temp*10 + r;
			 n2 = n2/10;
		 }
		 if(temp == n1) {
			 System.out.println(n1 + "="+ "It's a Palindrome");
		 }else {
			 System.out.println(n1+"="+"Its not a Palindrome");
		 }

	}

}
