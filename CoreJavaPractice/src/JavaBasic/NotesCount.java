 package JavaBasic;

public class NotesCount {

	public static void main(String[] args) {
		int[] notes = { 1000, 200, 500, 100, 50, 20, 10, 5 };
		int count = 0;
		int rupee = 16720;
		for (int i = 0; i < notes.length; i++) {
			count = rupee / notes[i];
			if (count > 0) {
				System.out.println(notes[i] + "=" + count);
			}
			rupee = rupee % notes[i];

		}
	}
}
