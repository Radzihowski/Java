package Spam.CodePracticing;

public class Front3 {
    public static void main(String[] args) {
        System.out.println(front3("Java"));
        System.out.println(front3("Chocalate"));
        System.out.println(front3("abc"));
        System.out.println(front3("abcXYZ"));
        System.out.println(front3("ab"));
        System.out.println(front3("aaa"));
        System.out.println(front3(""));
    }

    public static String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        } else {
            return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
        }
    }
}
// Solution from codingbat below:
//public String front3(String str) {
//    String front;
//
//    if (str.length() >= 3) {
//        front = str.substring(0, 3);
//    }
//    else {
//        front = str;
//    }
//
//    return front + front + front;
//}