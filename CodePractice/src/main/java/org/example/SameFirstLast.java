package org.example;

public class SameFirstLast {
    public static boolean sameFirstLast(int[] nums) {
        if ( nums.length == 0 ) {
            return false;
        }
        if ( nums[0] == nums[nums.length-1]) {
            return true;
        }
        return false;
    }
}
