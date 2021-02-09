package Spam;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.print(item);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            String item = array[i];
            System.out.print(item);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        // Random Objects from Array:
        // Math.abs(rand.nextInt) % length;
        int[] intArray2 = new int[4];
        printArray(intArray2);
        System.out.println();
        int[] intArray3 = {5, 2, 9, 1, 3};

        String[] ShoppingList = {"bananas", "apples", "pears"};

        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;

        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();

        // Custom print out arrays
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();

        //Retrieve objects
        System.out.println(intArray2[3]);
        Array.get(intArray2,3);
        System.out.println();

        //Given function
        Arrays.sort(intArray3);
        printArray(intArray3);

        // Print String Array
        System.out.println();
        printArray(ShoppingList);

        System.out.println("Special For Loop");
        //Special for loop: foreach
        for (String s : ShoppingList) {
//            System.out.println(s);
            System.out.println("Hi");
        }
    }
}
