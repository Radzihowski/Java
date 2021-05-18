package collectionsExample;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
    public static void main( String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Alexander");
        names.add("Piotr");
        names.add("Sam");
        names.add("Mike");
        names.add("Adam");

        Collections.sort(names);

        for ( String name : names) {
            System.out.println(name);
        }
    }
}
