package Spam.CodePractice1;

public class StringBits {
    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
    }

    static String stringBits(String str) {
        String result = "";
        for ( int i = 0; i < str.length(); i=i+2) {
            result = result + str.charAt(i);
        }
        return result;
    }
}
