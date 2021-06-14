package org.example;

public class MinCat {
    public static void main(String[] args) {

    }

    public static String minCat(String a, String b) {
        if (b.length() < a.length()) {
            return a.substring(a.length() - b.length()) + b;
        }
        if (b.length() > a.length()) {
            return a + b.substring(b.length() - a.length());
        }
        return a + b;
    }
}
