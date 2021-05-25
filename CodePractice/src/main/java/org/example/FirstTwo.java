package org.example;

public class FirstTwo {
    public static void main(String[] args) {

    }

    public static String firstTwo(String str) {
        if ( str.length() < 2 ) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }
}
