import java.io.*;
        import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

//        Scanner scanner = new Scanner(System.in);
//        String myString = scanner.nextLine();
//        char[] myCharArray;
//        myCharArray = myString.toCharArray();
//        for (int i = 0; i < myString.length(); i = i + 2) {
//            System.out.print(myCharArray[i]);
//        }
//        System.out.print(" ");
//        for (int i = 1; i < myString.length(); i = i + 2) {
//            System.out.print(myCharArray[i]);
//        }
//        scanner.close();
        Scanner scanner = new Scanner(System.in);
        int  T = scanner.nextInt();
        for (int j = 0; j < T ; j++) {
            String myString = scanner.next();
            char[] myCharArray;
            myCharArray = myString.toCharArray();
            for (int i = 0; i < myString.length(); i = i + 2) {
                System.out.print(myCharArray[i]);
            }
            System.out.print(" ");
            for (int i = 1; i < myString.length(); i = i + 2) {
                System.out.print(myCharArray[i]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
