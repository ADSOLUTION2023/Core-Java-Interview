package JavaBasic;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Value:");
		System.out.println("Enter Second Value:");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int f=0;
		
		for(int i =0;i<=10;i++) {
			f=num+num1;
			num=num1;
			num1=f;
			System.out.print(f+" ,");
			
		}
	}

}
