package org.example;

public class FirstHalf {
    public static void main(String[] args) {

    }

    public static String firstHalf(String str) {
        int middle = str.length()/2;
        return str.substring(0, middle);
    }
}
