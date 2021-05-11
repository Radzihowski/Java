package Spam.CodePractice1;

public class StringX {
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }

    public static String stringX(String str) {
        if ( str.length() < 2) {
            return str;
        }
        String result = str.substring(0,1);
        int i = 1;
        do {
            if (str.substring(i, i + 1).equals("x")) {
            } else {
                result = result + str.substring(i, i + 1);
            }
            i++;
        } while (i < str.length() - 1);
        return result + str.substring(str.length()-1);
    }
// Solution from codingbat:
//    public String stringX(String str) {
//        String result = "";
//        for (int i=0; i<str.length(); i++) {
//            // Only append the char if it is not the "x" case
//            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
//                result = result + str.substring(i, i+1); // Could use str.charAt(i) here
//            }
//        }
//        return result;
//    }
}
