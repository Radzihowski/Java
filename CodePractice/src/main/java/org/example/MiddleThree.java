package org.example;

public class MiddleThree {
    public static void main(String[] args) {

    }

    public static String middleThree(String str) {
        if (str.length() <= 3) {
            return str;
        } else {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
        }
    }
}