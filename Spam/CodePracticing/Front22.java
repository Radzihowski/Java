package Spam.CodePracticing;

public class Front22 {
    public static void main(String[] args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
    }

    public static String front22(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
    }
}
//    Solution:
//    public String front22(String str) {
//        // First figure the number of chars to take
//        int take = 2;
//        if (take > str.length()) {
//            take = str.length();
//        }
//
//        String front = str.substring(0, take);
//        return front + str + front;
//    }



