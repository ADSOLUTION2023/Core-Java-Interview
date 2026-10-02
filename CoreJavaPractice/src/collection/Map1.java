package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Amit");
		map.put(2, "Rahul");
		map.put(3, "Raj");

		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

		while (it.hasNext()) {

			Map.Entry<Integer, String> entry = it.next();

			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
