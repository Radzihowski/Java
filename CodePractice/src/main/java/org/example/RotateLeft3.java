//Given an array of ints length 3, return an array with the elements "rotated left"
//so {1, 2, 3} yields {2, 3, 1}.
//        rotateLeft3([1, 2, 3]) → [2, 3, 1]
//        rotateLeft3([5, 11, 9]) → [11, 9, 5]
//        rotateLeft3([7, 0, 0]) → [0, 0, 7]

package org.example;

import java.util.Arrays;

public class RotateLeft3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateLeft3(new int[]{1, 2, 3})));
    }

    public static int[] rotateLeft3(int[] nums) {
        int[] result = new int[3];

        for (int i = 1; i < 3; i++) {
            result[i-1] = nums[i];
        }
        result[nums.length-1] = nums[0];
        return result;
    }
}
