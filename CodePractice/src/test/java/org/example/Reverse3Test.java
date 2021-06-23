package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Reverse3Test {

    @Test
    public void testReverse30() {
        assertArrayEquals(new int[]{3, 2, 1}, Reverse3.reverse3(new int[]{1, 2, 3}), "Expected value: {3, 2, 1}");
//        assertArrayEquals((Arrays.toString(new int[]{3, 2, 1}), Reverse3.reverse3(new int[]{1, 2, 3}), "Expected value: {3, 2, 1}");
    }

    @Test
    public void testReverse31() {
        assertArrayEquals(new int[]{9, 11, 5}, Reverse3.reverse3(new int[]{5, 11, 9}), "Expected value: {9, 11, 5}");
    }

    @Test
    public void testReverse32() {
        assertArrayEquals(new int[]{0, 0, 7}, Reverse3.reverse3(new int[]{7, 0, 0}), "Expected value: {0, 0, 7}");
    }

    @Test
    public void testReverse33() {
        assertArrayEquals(new int[]{2, 1, 2}, Reverse3.reverse3(new int[]{2, 1, 2}), "Expected value: {2, 1, 2}");
    }

    @Test
    public void testReverse34() {
        assertArrayEquals(new int[]{1, 2, 1}, Reverse3.reverse3(new int[]{1, 2, 1}), "Expected value: {1, 2, 1}");
    }

    @Test
    public void testReverse35() {
        assertArrayEquals(new int[]{3, 11, 2}, Reverse3.reverse3(new int[]{2, 11, 3}), "Expected value: {3, 11, 2}");
    }

    @Test
    public void testReverse36() {
        assertArrayEquals(new int[]{5, 6, 0}, Reverse3.reverse3(new int[]{0, 6, 5}), "Expected value: {5, 6, 0}");
    }

    @Test
    public void testReverse37() {
        assertArrayEquals(new int[]{3, 2, 7}, Reverse3.reverse3(new int[]{7, 2, 3}), "Expected value: {3, 2, 7}");
    }
}
