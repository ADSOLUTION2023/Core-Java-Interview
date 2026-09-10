package practice1;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		String s = "Hello";
		String r = "World";
		String name = "Amit Vijay Chandsarkar";

		String s1 = s.toLowerCase();
		System.out.println(s1);
		String s2 = s.toUpperCase();
		System.out.println(s2);
		String r1 = r.trim();
		System.out.println(r1);
		String r2 = r.substring(0, 2);
		System.out.println(r2);
		char r3 = r.charAt(4);
		System.out.println(r3);
		/*
		 * String[] n1 = name.split(""); for (String word : n1) {
		 * System.out.print(word); }3333
		 *  
                              		 */
		char[] ch1 = name.toCharArray();
		
		Arrays.sort(ch1);
		System.out.println(ch1); 
		
		System.out.println("String Length:" + name.length());
		System.out.println("Index of Amit:" + name.indexOf("Amit"));
		System.out.println("Position of i:" + name.indexOf("i"));
		System.out.println("Last Position of i" + name.lastIndexOf("i"));
		System.out.println("A is replaced by B"+ name.replace("A", "B"));
		System.out.println("Starts with C" + name.startsWith("Vijay"));
		System.out.println("Dad's Name:" + name.substring(4,10));

	}

}
