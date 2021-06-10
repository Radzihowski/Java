package org.example;

public class ComboString {
    public static void main(String[] array) {

    }

    public static String comboString(String a, String b) {
        if ( a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }
}
