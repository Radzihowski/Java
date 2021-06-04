package org.example;

public class TheEnd {
    public static void main(String[] args) {

    }

    public static String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length()-1);
        }
    }
}
