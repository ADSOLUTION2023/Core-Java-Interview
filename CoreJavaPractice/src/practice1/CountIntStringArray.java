 package practice1;

import java.util.Arrays;

public class CountIntStringArray {

	public static void main(String[] args) {
		String[] s = { "amit12098345" };
		String r = "";
		int sum = 0;
		 

		for (String n : s) {
			char[] ch = n.toCharArray();
			for (int i = 0; i < n.length(); i++) {
				if (Character.isDigit(ch[i])) {
					r = r + n.charAt(i);
					sum = sum + Character.getNumericValue(n.charAt(i));
				}
			}
				int[] intArray = new int[r.length()];
				for (int i = 0; i < r.length(); i++) {
					intArray[i] = Character.getNumericValue(r.charAt(i));
				}
					System.out.println(Arrays.toString(intArray));
					System.out.println(sum);
				}
			}
		}

	

/*
 * public static void main(String[] args) { String[] names = { "kapil124" };
 * 
 * String r = "";
 * 
 * for (String s : names) { char[] ch = s.toCharArray();
 * 
 * for (int i = 0; i < ch.length; i++) { if (Character.isDigit(ch[i])) { r = r +
 * ch[i];
 * 
 * } }
 * 
 * int[] intArray = new int[r.length()];
 * 
 * for (int i = 0; i < r.length(); i++) { intArray[i] =
 * Character.getNumericValue(r.charAt(i)); }
 * System.out.println(Arrays.toString(intArray)); } }
 * 
 * }
 */
