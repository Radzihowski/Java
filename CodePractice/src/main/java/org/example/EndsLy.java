package org.example;

public class EndsLy {
    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
    }

    public static boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        if (str.substring(str.length() - 2).equals("ly")) {
            return true;
        } else {
            return false;
        }
    }
}
