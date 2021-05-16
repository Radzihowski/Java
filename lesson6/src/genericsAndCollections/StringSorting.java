package genericsAndCollections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StringSorting {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<String>();

        strings.add("Zed");
        strings.add("Alice");
        strings.add("Mike");

        //Before Sorting
        for ( String string : strings) {
            System.out.println(string);
        }

        // Sorting
        Collections.sort(strings);
        System.out.println("----------Sorted-----------");

        // After sorting
        for (String string : strings ) {
            System.out.println(string);
        }
    }
}
