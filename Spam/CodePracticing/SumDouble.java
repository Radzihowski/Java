package Spam.CodePracticing;

public class SumDouble {
    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
    }

    public static int sumDouble( int a, int b) {
        if ( a == b ) {
            return ( a + b ) * 2;
        }
        return a + b;
    }

//    Solution from codingbat.com:
//    public int sumDouble(int a, int b) {
//        // Store the sum in a local variable
//        int sum = a + b;
//
//        // Double it if a and b are the same
//        if (a == b) {
//            sum = sum * 2;
//        }
//
//        return sum;
//    }
}
