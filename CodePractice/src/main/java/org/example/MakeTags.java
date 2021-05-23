package org.example;

public class MakeTags {
    public static void main(String[] args) {

    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
