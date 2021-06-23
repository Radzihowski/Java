package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateLeft3Test {

    @Test
    public void testRotateLeft30() {
        assertArrayEquals(new int[]{2, 3, 1}, RotateLeft3.rotateLeft3(new int[]{1, 2, 3}), "Expected value: {2, 3, 1}");
    }

    @Test
    public void testRotateLeft31() {
        assertArrayEquals(new int[]{11, 9, 5}, RotateLeft3.rotateLeft3(new int[]{5, 11, 9}), "Expected value: {11, 9, 5}");
    }

    @Test
    public void testRotateLeft32() {
        assertArrayEquals(new int[]{0, 0, 7}, RotateLeft3.rotateLeft3(new int[]{7, 0, 0}), "Expected value: {0, 0, 7}");
    }

    @Test
    public void testRotateLeft33() {
        assertArrayEquals(new int[]{2, 1, 1}, RotateLeft3.rotateLeft3(new int[]{1, 2, 1}), "Expected value: {2, 1, 1}");
    }

    @Test
    public void testRotateLeft34() {
        assertArrayEquals(new int[]{0, 1, 0}, RotateLeft3.rotateLeft3(new int[]{0, 0, 1}), "Expected value: {0, 1, 0}");
    }
}
