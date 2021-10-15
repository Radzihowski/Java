package org.example;

import java.util.Locale;
import java.util.Scanner;

public class IsPalindrome {
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        str = str.toLowerCase();
        while ( i < j ) {
            if ( str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abba";
        String str2 = "geekjournal";
        String str3 = "level";
        String str4 = "tacocat";
        String str5 = "ababagalamaga";
        String str6 = "levEL";
        String str7 = "717";

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
        System.out.println(isPalindrome(str4));
        System.out.println(isPalindrome(str5));
        System.out.println(isPalindrome(str6));
        System.out.println(isPalindrome(str7));

        Scanner sc = new Scanner(System.in);
        for ( int i = 0; i < 5; i++) {
            System.out.println("Enter a string to check:");
            String str = sc.nextLine();
            System.out.println(isPalindrome(str));
        }

    }
}
