package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlusTwoTest {

    @Test
    public void testPlusTwo0() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, PlusTwo.plusTwo(new int[]{1, 2}, new int[]{3, 4}), "Expected value: {1, 2, 3, 4}");
    }

    @Test
    public void testPlusTwo1() {
        assertArrayEquals(new int[]{4, 4, 2, 2}, PlusTwo.plusTwo(new int[]{4, 4}, new int[]{2, 2}), "Expected value: {4, 4, 2, 2}");
    }

    @Test
    public void testPlusTwo2() {
        assertArrayEquals(new int[]{9, 2, 3, 4}, PlusTwo.plusTwo(new int[]{9, 2}, new int[]{3, 4}), "Expected value: {9, 2, 3, 4}");
    }
}
