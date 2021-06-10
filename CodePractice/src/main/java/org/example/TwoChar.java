package org.example;

public class TwoChar {
    public static void main(String[] args) {

    }

    public static String twoChar(String str, int index) {
        if( (index + 1 < str.length()) && (index >= 0)) {
            return str.substring(index, index+2);
        } else {
            return str.substring(0, 2);
        }
    }
}
