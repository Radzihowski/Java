package mapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Person> mapOfPeople = new HashMap<String, Person>();
        Person vladimir = new Person("Vladimir", "vladimir@gmail.com");
        Person augusto = new Person("Augusto", "augusto@gmail.com");
        Person alice = new Person("Alice", "alice@gmail.com");
        Person alex = new Person("Alex", "alex@gmail.com");
        Person prince = new Person("Prince", "prince@gmail.com");

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(vladimir);
        people.add(augusto);
        people.add(alice);
        people.add(alex);
        people.add(prince);

        for ( Person person: people) {
            MapExercise.addToMap(mapOfPeople, person);
        }

        for ( String email: mapOfPeople.keySet()) {
            System.out.println(email);
        }

        for ( Person person: mapOfPeople.values()) {
            System.out.println(person);
        }

        for (Person person : people) {
            mapOfPeople.put(person.getEmail(), person);
        }

    }

    private static void addToMap(Map<String, Person> map, Person person) {
        map.put(person.getEmail(), person);
    }
}
