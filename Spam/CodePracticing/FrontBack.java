package Spam.CodePracticing;

public class FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
        System.out.println(frontBack("abc"));
        System.out.println(frontBack(""));
        System.out.println(frontBack("Chocolate"));
        System.out.println(frontBack("aavJ"));
        System.out.println(frontBack("hello"));
    }

    public static String frontBack(String str) {
        if ( str.length() <= 1 ) {
            return str;
        } else {
            return str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0);
        }
    }
}

// Solution from codingbat not ideal from my point of view, by using extra variable String mid:
//    public String frontBack(String str) {
//        if (str.length() <= 1) return str;
//
//        String mid = str.substring(1, str.length()-1);
//
//        // last + mid + first
//        return str.charAt(str.length()-1) + mid + str.charAt(0);
//    }