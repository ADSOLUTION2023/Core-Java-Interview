package practice1;

public class StringBufferMethod {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("google");

		/*
		 * sb.append("World"); System.out.println(sb); String s = sb.toString();
		 * System.out.println(s); sb.reverse(); System.out.println(sb);
		 */
        int c = sb.capacity();
        System.out.println(c);
    }
}

