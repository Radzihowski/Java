package org.example;

public class StartWord {
    public static void main(String[] args) {

    }

    public static String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }
        if (str.substring(1, word.length()).equals(word.substring(1))) {
            return str.substring(0, word.length());
        }
        return "";
    }
}
