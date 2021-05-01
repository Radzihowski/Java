package Spam.CodePractice1;

public class FrontTimes {
    public static void main(String[] args) {
        System.out.println(fronTimes("Chocolate", 2));
        System.out.println(fronTimes("Chocolate", 3));
        System.out.println(fronTimes("Abc", 3));
        System.out.println(fronTimes("A", 4));
        System.out.println(fronTimes("", 4));
    }

    public static String fronTimes(String str, int n) {
        String result = "";
        if ( str.length() < 3 ) {
            for ( int i = 0; i < n; i++ ) {
                result = result +  str;
            }
            return result;
        }

        for ( int i = 0; i < n; i++ ) {
            result = result +  str.substring(0, 3);
        }
        return result;
    }

//    Solution from codingbat:
//    public String frontTimes(String str, int n) {
//        int frontLen = 3;
//        if (frontLen > str.length()) {
//            frontLen = str.length();
//        }
//        String front = str.substring(0, frontLen);
//
//        String result = "";
//        for (int i=0; i<n; i++) {
//            result = result + front;
//        }
//        return result;
//    }
}
