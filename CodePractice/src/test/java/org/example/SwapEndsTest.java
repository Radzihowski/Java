package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SwapEndsTest {

    @Test
    public void testSwapEnds0() {
        assertArrayEquals(new int[]{4, 2, 3, 1}, SwapEnds.swapEnds(new int[]{1, 2, 3, 4}), "Expected value: {4, 2, 3, 1}");
    }

    @Test
    public void testSwapEnds1() {
        assertArrayEquals(new int[]{3, 2, 1}, SwapEnds.swapEnds(new int[]{1, 2, 3}), "Expected value: {3, 2, 1}");
    }

    @Test
    public void testSwapEnds2() {
        assertArrayEquals(new int[]{5, 6, 7, 9, 8}, SwapEnds.swapEnds(new int[]{8, 6, 7, 9, 5}), "Expected value: {5, 6, 7, 9, 8}");
    }

    @Test
    public void testSwapEnds3() {
        assertArrayEquals(new int[]{9, 1, 4, 1, 5, 3}, SwapEnds.swapEnds(new int[]{3, 1, 4, 1, 5, 9}), "Expected value: {9, 1, 4, 1, 5, 3}");
    }

    @Test
    public void testSwapEnds4() {
        assertArrayEquals(new int[]{2, 1}, SwapEnds.swapEnds(new int[]{1, 2}), "Expected value: {2, 1}");
    }

    @Test
    public void testSwapEnds5() {
        assertArrayEquals(new int[]{1}, SwapEnds.swapEnds(new int[]{1}), "Expected value: {1}");
    }
}
