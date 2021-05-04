package Spam.CodePractice1;

public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }

    static boolean doubleX(String str) {
        int i = str.indexOf('x');
        if ( i == -1 ) return false;
        if ( i+1 >= str.length()) return false;
        return str.substring(i+1,i+2).equals("x");
    }

    // Solution from codingbat.com:
    // Another approach -- .startsWith() simplifies the logic
    // String x = str.substring(i);
    // return x.startsWith("xx");
}
