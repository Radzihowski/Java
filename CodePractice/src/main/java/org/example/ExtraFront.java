package org.example;

public class ExtraFront {
    public static void main(String[] args) {

    }

    public static String extraFront(String str) {
        if (str.length() < 2) {
            return str+str+str;
        }
        return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
    }
}
