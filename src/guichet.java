import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class guichet {
    public static void main(String[] args) {
        Deque<String> test = new ArrayDeque<String>();

        test.add("add: 0");
        test.add("add: 1");
        test.addFirst("First: 2");
        test.addFirst("First: 3");
        test.addLast("Last: 4");
        test.addLast("Last: 5");

        Iterator<String> e = test.iterator();
        while(e.hasNext()) {
            System.out.println(e.next());
        }

    }

}
