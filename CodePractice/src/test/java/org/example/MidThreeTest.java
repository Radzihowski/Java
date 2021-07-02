package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MidThreeTest {

    @Test
    public void testMidThree0() {
        assertArrayEquals(new int[]{2, 3, 4}, MidThree.midThree(new int[]{1, 2, 3, 4, 5}), "Expected value: {2, 3, 4}");
    }

    @Test
    public void testMidThree1() {
        assertArrayEquals(new int[]{7, 5, 3}, MidThree.midThree(new int[]{8, 6, 7, 5, 3, 0, 9}), "Expected value: {7, 5, 3}");
    }

    @Test
    public void testMidThree2() {
        assertArrayEquals(new int[]{1, 2, 3}, MidThree.midThree(new int[]{1, 2, 3}), "Expected value: {1, 2, 3}");
    }

}
