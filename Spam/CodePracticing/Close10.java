package Spam.CodePracticing;

public class Close10 {
    public static void main(String[] args) {
        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));
    }

    public static int close10(int a, int b) {
        if (Math.abs(10 - a) < (Math.abs(10 - b))) {
            return a;
        }
        if (Math.abs(10 - a) > (Math.abs(10 - b))) {
            return b;
        }
        return 0;
    }

//    Soluton from codingbat.com:
//    public int close10(int a, int b) {
//        int aDiff = Math.abs(a - 10);
//        int bDiff = Math.abs(b - 10);
//
//        if (aDiff < bDiff) {
//            return a;
//        }
//        if (bDiff < aDiff) {
//            return b;
//        }
//        return 0;  // i.e. aDiff == bDiff
//
//        // Solution notes: aDiff/bDiff local vars clean the code up a bit.
//        // Could have "else" before the second if and the return 0.
//    }
}
