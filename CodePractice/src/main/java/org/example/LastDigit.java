/* Given three ints, a b c, return true if two or more of them have the same rightmost digit.
The ints are non-negative.
lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
 */

package org.example;

public class LastDigit {
    public static boolean lastDigit(int a, int b, int c) {
        a = a % 10;
        b = b % 10;
        c = c % 10;
        if ( a == b || b == c || a == c) {
            return true;
        } else {
            return false;
        }
    }
}
