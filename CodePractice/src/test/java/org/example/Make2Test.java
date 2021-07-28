package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Make2Test {

    @Test
    public void testMake20() {
        assertArrayEquals(new int[]{4, 5}, Make2.make2(new int[]{4, 5}, new int[]{1, 2, 3}), "Expected value: {4, 5}");
    }

    @Test
    public void testMake21() {
        assertArrayEquals(new int[]{4, 1}, Make2.make2(new int[]{4}, new int[]{1, 2, 3}), "Expected value: {4, 5}");
    }

    @Test
    public void testMake22() {
        assertArrayEquals(new int[]{1, 2}, Make2.make2(new int[]{}, new int[]{1, 2}), "Expected value: {4, 5}");
    }

    @Test
    public void testMake23() {
        assertArrayEquals(new int[]{1, 2}, Make2.make2(new int[]{}, new int[]{1, 2}), "Expected value: {1, 2}");
    }

    @Test
    public void testMake24() {
        assertArrayEquals(new int[]{3, 1}, Make2.make2(new int[]{3}, new int[]{1, 2, 3}), "Expected value: {3, 1}");
    }

    @Test
    public void testMake25() {
        assertArrayEquals(new int[]{3, 1}, Make2.make2(new int[]{3}, new int[]{1}), "Expected value: {3, 1}");
    }

    @Test
    public void testMake26() {
        assertArrayEquals(new int[]{3, 1}, Make2.make2(new int[]{3, 1, 4}, new int[]{}), "Expected value: {3, 1}");
    }

    @Test
    public void testMake27() {
        assertArrayEquals(new int[]{1, 1}, Make2.make2(new int[]{1}, new int[]{1}), "Expected value: {1, 1}");
    }

    @Test
    public void testMake28() {
        assertArrayEquals(new int[]{1, 2}, Make2.make2(new int[]{1, 2, 3}, new int[]{7, 8}), "Expected value: {1, 2}");
    }

    @Test
    public void testMake29() {
        assertArrayEquals(new int[]{7, 8}, Make2.make2(new int[]{7, 8}, new int[]{1, 2, 3}), "Expected value: {7, 8}");
    }

    @Test
    public void testMake210() {
        assertArrayEquals(new int[]{7, 1}, Make2.make2(new int[]{7}, new int[]{1, 2, 3}), "Expected value: {7, 1}");
    }

    @Test
    public void testMake211() {
        assertArrayEquals(new int[]{5, 4}, Make2.make2(new int[]{5, 4}, new int[]{2, 3, 7}), "Expected value: {5, 4}");
    }
}
