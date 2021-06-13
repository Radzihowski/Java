package org.example;

public class LastTwo {
    public static void main(String[] args) {

    }

    public static String lastTwo(String str) {
        if (str.length() == 1 || str.equals("")) {
            return str;
        }
        return str.substring(0, str.length()-2) + str.substring(str.length()-1) + str.substring(str.length()-2, str.length()-1);
    }
}
