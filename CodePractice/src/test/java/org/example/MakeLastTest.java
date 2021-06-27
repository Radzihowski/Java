package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MakeLastTest {

    @Test
    public void testMakeLast0() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 6}, MakeLast.makeLast(new int[]{4, 5, 6}), "Expected value: {0, 0, 0, 0, 0, 6}");
    }

    @Test
    public void testMakeLast1() {
        assertArrayEquals(new int[]{0, 0, 0, 2}, MakeLast.makeLast(new int[]{1, 2}), "Expected value: {0, 0, 0, 2}");
    }

    @Test
    public void testMakeLast2() {
        assertArrayEquals(new int[]{0, 3}, MakeLast.makeLast(new int[]{3}), "Expected value: {0, 3}");
    }

    @Test
    public void testMakeLast3() {
        assertArrayEquals(new int[]{0, 0}, MakeLast.makeLast(new int[]{0}), "Expected value: {0, 0}");
    }

    @Test
    public void testMakeLast4() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 7}, MakeLast.makeLast(new int[]{7, 7, 7}), "Expected value: {0, 0, 0, 0, 0, 7}");
    }

    @Test
    public void testMakeLast5() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 4}, MakeLast.makeLast(new int[]{3, 1, 4}), "Expected value: {0, 0, 0, 0, 0, 4}");
    }

    @Test
    public void testMakeLast6() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 4}, MakeLast.makeLast(new int[]{1, 2, 3, 4}), "Expected value: {0, 0, 0, 0, 0, 0, 0, 4}");
    }

    @Test
    public void testMakeLast7() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 0}, MakeLast.makeLast(new int[]{1, 2, 3, 0}), "Expected value: {0, 0, 0, 0, 0, 0, 0, 0}");
    }

    @Test
    public void testMakeLast8() {
        assertArrayEquals(new int[]{0, 0, 0, 4}, MakeLast.makeLast(new int[]{2, 4}), "Expected value: {0, 0, 0, 4}");
    }
}
