package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast1 {

    public static void main(String[] args) {

        System.out.println("PROGRAM START");

        List<Integer> l = new ArrayList<>();

        l.add(1);
        l.add(3);
        l.add(2);

        System.out.println("Before Iterator: " + l);

        Iterator<Integer> it = l.iterator();

        System.out.println("Iterator Created");

        l.add(5);

        System.out.println("After Modification: " + l);

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("PROGRAM END");
    }
}