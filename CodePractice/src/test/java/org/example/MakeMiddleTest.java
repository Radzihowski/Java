package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MakeMiddleTest {

    @Test
    public void testMakeMiddle0() {
        assertArrayEquals(new int[]{2, 3}, MakeMiddle.makeMiddle(new int[]{1, 2, 3, 4}), "Expected value: {2, 3}");
    }

    @Test
    public void testMakeMiddle1() {
        assertArrayEquals(new int[]{2, 3}, MakeMiddle.makeMiddle(new int[]{7, 1, 2, 3, 4, 9}), "Expected value: {2, 3}");
    }

    @Test
    public void testMakeMiddle2() {
        assertArrayEquals(new int[]{1, 2}, MakeMiddle.makeMiddle(new int[]{1, 2}), "Expected value: {1, 2}");
    }

    @Test
    public void testMakeMiddle3() {
        assertArrayEquals(new int[]{2, 4}, MakeMiddle.makeMiddle(new int[]{5, 2, 4, 7}), "Expected value: {2, 4}");
    }

    @Test
    public void testMakeMiddle4() {
        assertArrayEquals(new int[]{4, 3}, MakeMiddle.makeMiddle(new int[]{9, 0, 4, 3, 9, 1}), "Expected value: {4, 3}");
    }
}
