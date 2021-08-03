package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Front11Test {

    @Test
    public void testFront110() {
        assertArrayEquals(new int[]{1, 7}, Front11.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8}), "Expected value: {1, 7}");
    }

    @Test
    public void testFront111() {
        assertArrayEquals(new int[]{1, 2}, Front11.front11(new int[]{1}, new int[]{2}), "Expected value: {1, 2}");
    }

    @Test
    public void testFront112() {
        assertArrayEquals(new int[]{1}, Front11.front11(new int[]{1, 7}, new int[]{}), "Expected value: {1}");
    }

    @Test
    public void testFront113() {
        assertArrayEquals(new int[]{2}, Front11.front11(new int[]{}, new int[]{2, 8}), "Expected value: {2}");
    }

    @Test
    public void testFront114() {
        assertArrayEquals(new int[]{}, Front11.front11(new int[]{}, new int[]{}), "Expected value: {}");
    }

    @Test
    public void testFront115() {
        assertArrayEquals(new int[]{3, 1}, Front11.front11(new int[]{3}, new int[]{1, 4, 1, 9}), "Expected value: {3, 1}");
    }

    @Test
    public void testFront116() {
        assertArrayEquals(new int[]{1}, Front11.front11(new int[]{1, 4, 1, 9}, new int[]{}), "Expected value: {1}");
    }
}
