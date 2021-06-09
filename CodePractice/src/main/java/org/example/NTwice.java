package org.example;

public class NTwice {
    public static void main(String[] args) {
        System.out.println(nTwice("Hello", 2));
    }

    public static String nTwice(String str, int n) {
        System.out.println(str.substring(0, n));
        return str.substring(0, n) + str.substring(str.length()-n);
    }
}
