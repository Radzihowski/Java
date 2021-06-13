package org.example;

public class ConCat {
    public static void main(String[] args) {

    }

    public static String conCat(String a, String b) {
        if (a.equals("")) {
            return b;
        }
        if (b.equals("")) {
            return a;
        }
        if ( a.substring(a.length()-1).equals(b.substring(0,1))) {
            return a + b.substring(1, b.length());
        }
        return a + b;
    }
}
