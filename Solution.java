import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static public String checkNumber(int N) {
        if ((N % 2) != 0)
            return "Weird";
        else if (2 <= N  & N <= 5)
            return "Not Weird";
        else if (6 <= N & N <= 20)
            return "Weird";
        else
            return "Not Weird";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        checkNumber(N);
        System.out.println(checkNumber(N));

        scanner.close();
    }

}
