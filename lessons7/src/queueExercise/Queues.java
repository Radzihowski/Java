package queueExercise;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("Hi");
        myQueue.add("Hi");
        myQueue.add("Hello");
        myQueue.add("There");

        while ( !myQueue.isEmpty()) {
            System.out.println(myQueue.poll());
        }
    }
}
