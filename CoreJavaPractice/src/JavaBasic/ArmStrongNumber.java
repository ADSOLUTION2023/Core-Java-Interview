package JavaBasic;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		int n = num;
		int r = 0;
		int temp = 0;
		while (n > 0) {
			r = n % 10;
			temp = temp + r * r * r;
			n = n / 10;
		}
		if (temp == num) {
			System.out.println(num + ": It's an ArmStrong Number");
		} else {
			System.out.println(num + ": It's not an ArmStrong Number");
		}
	}
}
