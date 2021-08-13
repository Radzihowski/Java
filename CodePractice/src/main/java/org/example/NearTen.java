/* Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
 */

package org.example;

public class NearTen {
    public static boolean nearTen(int num) {
        int reminder = (num + 2)%10;
        return ( reminder >= 0 && reminder <=4);
    }
}

/* or another solution
public boolean nearTen(int num) {
    if (num % 10 < 3 || num % 10 >=8)
        return true;
    else return false;
}
*/
