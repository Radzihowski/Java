package org.example;

public class SeeColor {
    public static void main(String[] args) {

    }

    public static String seeColor(String str) {
        if ( str.length() < 3 ) {
            return "";
        }
        if ( str.substring(0, 3).equals("red")) {
            return "red";
        }
        if ( str.length() >= 4 && str.substring(0, 4).equals("blue")) {
            return "blue";
        }
        return "";
    }
}
