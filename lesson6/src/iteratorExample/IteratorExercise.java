package iteratorExample;

import java.util.*;

public class IteratorExercise {
    public static void main(String[] exercise) {
        List<String> names = new LinkedList<String>();
        names.add("Mike");
        names.add("Bob");
        names.add("Alice");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Queue<String> strings = new ArrayDeque<>();
        strings.add("Sally");
        strings.add("Cesar");

        iterator = strings.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
