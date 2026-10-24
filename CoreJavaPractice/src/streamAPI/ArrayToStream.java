package streamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
	public static void main(String[] args) {
		String[] str = { "kapil", "1", "x", "v" };
		Stream<String> stream = Arrays.stream(str);
		//stream.sorted().distinct().forEach(System.out::println);
		
		String [] arr = stream.sorted().distinct().toArray(String []::new);
		System.out.println(Arrays.toString(arr));
	}

}

