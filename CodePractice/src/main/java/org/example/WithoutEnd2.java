package org.example;

public class WithoutEnd2 {
    public static void main(String[] args) {

    }

    public static String withoutEnd2(String str) {
        if ( str.length() < 3 ) {
            return "";
        } else {
            return str.substring(1, str.length()-1);
        }
    }
}
