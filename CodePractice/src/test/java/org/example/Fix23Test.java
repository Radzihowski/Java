package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Fix23Test {

    @Test
    public void testFix230() {
        assertArrayEquals(new int[]{1, 2, 0}, Fix23.fix23(new int[]{1, 2, 3}), "Expected value: {1, 2, 0]}");
    }

    @Test
    public void testFix231() {
        assertArrayEquals(new int[]{2, 0, 5}, Fix23.fix23(new int[]{2, 3, 5}), "Expected value: {2, 0, 5]}");
    }

    @Test
    public void testFix232() {
        assertArrayEquals(new int[]{1, 2, 1}, Fix23.fix23(new int[]{1, 2, 1}), "Expected value: {1, 2, 1]}");
    }

    @Test
    public void testFix233() {
        assertArrayEquals(new int[]{3, 2, 1}, Fix23.fix23(new int[]{3, 2, 1}), "Expected value: {3, 2, 1]}");
    }

    @Test
    public void testFix234() {
        assertArrayEquals(new int[]{2, 2, 0}, Fix23.fix23(new int[]{2, 2, 3}), "Expected value: {2, 2, 0]}");
    }

    @Test
    public void testFix235() {
        assertArrayEquals(new int[]{2, 0, 3}, Fix23.fix23(new int[]{2, 3, 3}), "Expected value: {2, 0, 3]}");
    }

}
