package Spam;

import java.util.*;

class Anagrams
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        char[] array = new char[word.length()];

        // copy character by character from string to array
        for ( int i = 0; i < array.length; i++) {
            array[i] = word.charAt(i);
        }

        // print array vise versa
        for ( int i = word.length()-1; i >= 0; i-- ) {
            System.out.print(array[i]);
        }
    }
}