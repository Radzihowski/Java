package setExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExcercise {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<String>();

        numbers.add("077");
        numbers.add("071");
        numbers.add("077");
        numbers.add("073");
        numbers.add("077");
        numbers.add("073");
        numbers.add("074");

        Set<String> uniqueNumbers = new HashSet<String>(numbers);

        for ( String number: uniqueNumbers) {
            System.out.println(number);
        }
    }
}
