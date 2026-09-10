package JavaBasic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
	 long a =sc.nextInt();
	 long fac = 1;
	 
	 for (long i=a;i>0;i--) {
		 fac =fac*i;
	 }
	 System.out.println(fac);

	}

}
