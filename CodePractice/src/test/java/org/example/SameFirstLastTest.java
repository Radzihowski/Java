package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SameFirstLastTest {

    @Test
    public void testSameFirstLast0() {
        assertEquals(false, SameFirstLast.sameFirstLast(new int[]{1, 2, 3}), "Expected value: false");
    }

    @Test
    public void testSameFirstLast1() {
        assertEquals(true, SameFirstLast.sameFirstLast(new int[]{1, 2, 3, 1}), "Expected value: true");
    }

    @Test
    public void testSameFirstLast2() {
        assertEquals(true, SameFirstLast.sameFirstLast(new int[]{1, 2, 1}), "Expected value: true");
    }

    @Test
    public void testSameFirstLast3() {
        assertEquals(true, SameFirstLast.sameFirstLast(new int[]{7}), "Expected value: true");
    }

    @Test
    public void testSameFirstLast4() {
        assertEquals(false, SameFirstLast.sameFirstLast(new int[]{}), "Expected value: false");
    }

    @Test
    public void testSameFirstLast5() {
        assertEquals(true, SameFirstLast.sameFirstLast(new int[]{1, 2, 3, 4, 5, 1}), "Expected value: true");
    }

    @Test
    public void testSameFirstLast6() {
        assertEquals(false, SameFirstLast.sameFirstLast(new int[]{1, 2, 3, 4, 5, 13}), "Expected value: false");
    }

    @Test
    public void testSameFirstLast7() {
        assertEquals(true, SameFirstLast.sameFirstLast(new int[]{13, 2, 3, 4, 5, 13}), "Expected value: true");
    }

    @Test
    public void testSameFirstLast8() {
        assertEquals(true, SameFirstLast.sameFirstLast(new int[]{7, 7}), "Expected value: true");
    }

}
