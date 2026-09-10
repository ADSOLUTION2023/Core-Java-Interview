package practice1;

public class CountOccuranceOfCharacter {
	public static void main(String[] args) {
		String s = "amitaaa";
		int count = 0;
		for (char a = 'a'; a <= 'z'; a++)
			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) == 'a') {
					count++;
				}
			}

		System.out.println("Count: " + count);
	}
}