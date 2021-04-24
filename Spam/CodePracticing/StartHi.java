package Spam.CodePracticing;

public class StartHi {
    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
    }

    public static boolean startHi(String str) {
        if ( str.length() < 2 ) {
            return false;
        }
        String frontStr = str.substring(0,2);
        return (frontStr.equals("hi"));
        }
    }

