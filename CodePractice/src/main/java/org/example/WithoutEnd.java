package org.example;

public class WithoutEnd {
    public static void main(String[] array) {

    }

    public static String withoutEnd(String str) {
        if (str.length() <= 2 ) {
            return "";
        }
        return str.substring(1,str.length()-1);
    }
}
