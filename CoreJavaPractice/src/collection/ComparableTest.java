package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new  ComparablePOJO(4, "kapil"));
		list.add(new  ComparablePOJO(2, "c"));
		list.add(new ComparablePOJO(3, "e"));
		list.add(new  ComparablePOJO(1, "d"));

		Collections.sort(list);

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
