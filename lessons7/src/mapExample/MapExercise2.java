package mapExample;

import java.util.HashMap;
import java.util.Map;

public class MapExercise2 {
    public static void main(String[] args) {
        Map<String, Person> mapOfPeople = new HashMap<>();
        Person mike = new Person("Mike", "mike@gmail.com");
        Person shaun = new Person("Shaun", "shaun@gmail.com");
        Person sally = new Person("Sally", "sally@gmail.com");
        Person cesar = new Person("Cesar", "cesar@gmail.com");

        mapOfPeople.put(mike.getEmail(), mike);
        mapOfPeople.put(shaun.getEmail(), shaun);
        mapOfPeople.put(sally.getEmail(), sally);
        mapOfPeople.put(cesar.getEmail(), cesar);

        for (String email : mapOfPeople.keySet()) {
            System.out.println(email);
        }

        for ( Person person: mapOfPeople.values()) {
            System.out.println(person);
        }

        System.out.println("Get Mike " + mapOfPeople.get("mike@gmail.com"));
        System.out.println("Get Jeff " + mapOfPeople.get("jeff@email.com"));
        System.out.println("Contains Mike: " + mapOfPeople.containsKey("mike@gmail.com"));
        System.out.println("Contains Jeff: " + mapOfPeople.containsKey("jeff@email.com"));
    }
}
