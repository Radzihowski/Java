package org.example;

public class ExtraEnd {
    public static void main(String[] args) {

    }

    public static String extraEnd(String str) {
        String result = str.substring(str.length()-2);
        return result + result + result;
    }
}
