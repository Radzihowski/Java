package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BiggerTwoTest {

    @Test
    public void testBiggerTwo0() {
        assertArrayEquals(new int[]{3, 4}, BiggerTwo.biggerTwo(new int[]{1, 2}, new int[]{3, 4}), "Expected value: {3, 4]}");
    }

    @Test
    public void testBiggerTwo1() {
        assertArrayEquals(new int[]{3, 4}, BiggerTwo.biggerTwo(new int[]{3, 4}, new int[]{1, 2}), "Expected value: {3, 4]}");
    }

    @Test
    public void testBiggerTwo2() {
        assertArrayEquals(new int[]{1, 2}, BiggerTwo.biggerTwo(new int[]{1, 1}, new int[]{1, 2}), "Expected value: {1, 2]}");
    }

    @Test
    public void testBiggerTwo3() {
        assertArrayEquals(new int[]{2, 1}, BiggerTwo.biggerTwo(new int[]{1, 1}, new int[]{2, 1}), "Expected value: {2, 1]}");
    }

    @Test
    public void testBiggerTwo4() {
        assertArrayEquals(new int[]{2, 2}, BiggerTwo.biggerTwo(new int[]{2, 2}, new int[]{1, 3}), "Expected value: {2, 2]}");
    }

    @Test
    public void testBiggerTwo5() {
        assertArrayEquals(new int[]{1, 3}, BiggerTwo.biggerTwo(new int[]{1, 3}, new int[]{2, 2}), "Expected value: {1, 3]}");
    }

    @Test
    public void testBiggerTwo6() {
        assertArrayEquals(new int[]{6, 7}, BiggerTwo.biggerTwo(new int[]{6, 7}, new int[]{3, 1}), "Expected value: {6, 7]}");
    }
}
