package org.example;

public class Without2 {
    public static void main(String[] args) {

    }

    public static String without2(String str) {
        if ( str.length() <= 1) {
            return str;
        }
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2, str.length());
        }
        if ( str.length() < 1) {
            return str;
        }
        return str;
    }
}
