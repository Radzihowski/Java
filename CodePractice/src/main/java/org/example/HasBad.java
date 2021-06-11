package org.example;

public class HasBad {
    public static void main(String[] args) {

    }

    public static boolean hasBad(String str) {
        if (str.length() < 2) {
            return false;
        }

        if (str.length() == 3) {
            if (str.equals("bad")) {
                return true;
            } else {
                return false;
            }
        }
        if (str.length() >= 4) {
            for (int i = 0; i < 2; i++) {
                if (str.substring(i, i + 3).equals("bad")) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
