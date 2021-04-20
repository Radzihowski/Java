package Spam.CodePracticing;

public class Makes10 {
    public static void main(String[] args) {
        System.out.println(makes10(9, 10));
        System.out.println(makes10(9, 9));
        System.out.println(makes10(1, 10));
        System.out.println(makes10(10, 1));
        System.out.println(makes10(10, 10));
        System.out.println(makes10(8, 2));
        System.out.println(makes10(8, 3));
        System.out.println(makes10(10, 42));
        System.out.println(makes10(12, -2));
    }

    public static boolean makes10(int a, int b) {
        return ( 10 == a || 10 == b || 10 == a + b);
    }
}

// Solution from codingbat.com: it is morelogical a ==.... b ==.. it is more readable.
//public boolean makes10(int a, int b) {
//  return (a == 10 || b == 10 || a+b == 10);
//}