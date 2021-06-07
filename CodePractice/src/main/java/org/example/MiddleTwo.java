package org.example;

public class MiddleTwo {
    public static void main(String[] arg) {

    }

    public static String middleTwo(String str) {
        if (str.length() == 2) {
            return str;
        } else {
            return str.substring(str.length()/2-1, str.length()/2+1);
        }
    }
}
