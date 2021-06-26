//Given an int array length 2, return true if it contains a 2 or a 3.
//        has23([2, 5]) → true
//        has23([4, 3]) → true
//        has23([4, 5]) → false

package org.example;

public class Has23 {
    public static boolean has23(int[] nums) {
        for (int i = 0; i < 2; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return true;
            }
        }
        return false;
    }
}
