package Spam.CodePractice1;

public class CountXX {
    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
    }

    public static int countXX(String str) {
        int counter = 0;
        for ( int i = 0; i < str.length()-1; i++) {
            if (( str.charAt(i) == str.charAt(i+1) && str.charAt(i) == 'x' )) {
                counter++;
            }
        }
        return counter;
    }
}
