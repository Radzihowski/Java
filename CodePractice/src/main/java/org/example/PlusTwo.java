package org.example;

public class PlusTwo {
    public static int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[4];
        result[0] = a[0];
        result[1] = a[1];
        result[2] = b[0];
        result[3] = b[1];
        return result;
    }
}
