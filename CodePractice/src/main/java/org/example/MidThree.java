//Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
//The array length will be at least 3.
//midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
//midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
//midThree([1, 2, 3]) → [1, 2, 3]

package org.example;

public class MidThree {
    public static int[] midThree(int[] nums) {
        int[] result = new int[3];
        result[0] = nums[nums.length / 2 - 1];
        result[1] = nums[nums.length / 2];
        result[2] = nums[nums.length / 2 + 1];
        return result;
    }
}