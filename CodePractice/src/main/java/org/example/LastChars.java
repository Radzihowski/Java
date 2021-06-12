package org.example;

public class LastChars {
    public static void main(String[] args) {

    }

    public static String lastChars(String a, String b) {
        String first = "";
        String second = "";
        if (a.length() < 1) {
            first = "@";
        }
        if ( a.length() >=1 ) {
            first = a.substring(0, 1);
        }
        if (b.length() < 1) {
            second = "@";
        }
        if (b.length() >= 1) {
            second = b.substring(b.length()-1);
        }
        return first + second;
    }
}
