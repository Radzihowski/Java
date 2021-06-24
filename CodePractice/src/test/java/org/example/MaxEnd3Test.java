package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaxEnd3Test {

    @Test
    public void testMaxEnd30() {
        assertArrayEquals(new int[]{3, 3, 3}, MaxEnd3.maxEnd3(new int[]{1, 2, 3}), "Expected value: {3, 3, 3}");
    }

    @Test
    public void testMaxEnd31() {
        assertArrayEquals(new int[]{11, 11, 11}, MaxEnd3.maxEnd3(new int[]{11, 5, 9}), "Expected value: {11, 11, 11}");
    }

    @Test
    public void testMaxEnd32() {
        assertArrayEquals(new int[]{3, 3, 3}, MaxEnd3.maxEnd3(new int[]{2, 11, 3}), "Expected value: {3, 3, 3}");
    }

    @Test
    public void testMaxEnd33() {
        assertArrayEquals(new int[]{11, 11, 11}, MaxEnd3.maxEnd3(new int[]{11, 3, 3}), "Expected value: {11, 11, 11}");
    }

    @Test
    public void testMaxEnd34() {
        assertArrayEquals(new int[]{11, 11, 11}, MaxEnd3.maxEnd3(new int[]{3, 11, 11}), "Expected value: {11, 11, 11}");
    }

    @Test
    public void testMaxEnd35() {
        assertArrayEquals(new int[]{2, 2, 2}, MaxEnd3.maxEnd3(new int[]{2, 2, 2}), "Expected value: {2, 2, 2}");
    }

    @Test
    public void testMaxEnd36() {
        assertArrayEquals(new int[]{2, 2, 2}, MaxEnd3.maxEnd3(new int[]{2, 11, 2}), "Expected value: {2, 2, 2}");
    }

    @Test
    public void testMaxEnd37() {
        assertArrayEquals(new int[]{1, 1, 1}, MaxEnd3.maxEnd3(new int[]{0, 0, 1}), "Expected value: {1, 1, 1}");
    }
}
