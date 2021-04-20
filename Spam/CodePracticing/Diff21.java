package Spam.CodePracticing;

public class Diff21 {
    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(22));
        System.out.println(diff21(25));
        System.out.println(diff21(30));
        System.out.println(diff21(0));
        System.out.println(diff21(1));
        System.out.println(diff21(2));
        System.out.println(diff21(-1));
        System.out.println(diff21(-2));
        System.out.println(diff21(50));

    }
        public static int diff21(int n){
            if ( n < 21) {
                return 21 - n;
            } else {
                return -((21 - n)*2);
            }
        }
    }

//Proposed solution. I found it intersting instead of changing symbol you can change places.
//    public int diff21(int n) {
//        if (n <= 21) {
//            return 21 - n;
//        } else {
//            return (n - 21) * 2;
//        }
//    }