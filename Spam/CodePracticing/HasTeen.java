package Spam.CodePracticing;

public class HasTeen {
    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 10, 13));
        System.out.println(hasTeen(1, 20, 12));
        System.out.println(hasTeen(12, 9, 20));
        System.out.println(hasTeen(4, 2, 20));
        System.out.println(hasTeen(11, 22, 22));
    }

    public static boolean hasTeen(int a, int b, int c) {
        return ( a >= 13 && a <= 19) || ( b >= 13 && b <= 19) || ( c >= 13 && c <= 19);
    }
}
