package Spam.CodePractice1;

public class StringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }

    public static int stringMatch(String a, String b) {
        int count = 0;
        int len = Math.min(a.length(), b.length());

        for (int i = 0; i < len-1; i++) {
            String strA = a.substring(i, i + 2);
            String strB = b.substring(i, i + 2);
            if (strA.equals(strB)) {
                count++;
            }
        }
        return count;
    }
}