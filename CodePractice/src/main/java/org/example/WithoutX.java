package org.example;

public class WithoutX {
    public static void main(String[] args) {

    }

    public static String withoutX(String str) {
        String result = str;
        if (str.length() == 0) {
            return str;
        }

        if (str.length() == 1) {
            if (str == "x") {
                return "";
            } else {
                return str;
            }
        }

        if (str.substring(str.length() - 1).equals("x")) {
            result = str.substring(0, str.length() - 1);
        }

        if (result.substring(0, 1).equals("x")) {
            result = result.substring(1);
        }
        return result;
    }
}
