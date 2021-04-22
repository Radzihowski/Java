package Spam.CodePracticing;

public class NotString {
    public static void main(String[] args) {
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
        System.out.println(notString("bad"));
        System.out.println(notString("not"));
        System.out.println(notString("not is not"));
        System.out.println(notString("not no"));
    }

    public static String notString(String str) {
        if (str.length() >=3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }
}
