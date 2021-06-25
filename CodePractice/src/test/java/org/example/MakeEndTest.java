package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MakeEndTest {

    @Test
    public void testMakeEnds0() {
        assertArrayEquals(new int[]{1, 3}, MakeEnds.makeEnds(new int[]{1, 2, 3}), "Expected value: {1, 3}");
    }

    @Test
    public void testMakeEnds1() {
        assertArrayEquals(new int[]{1, 4}, MakeEnds.makeEnds(new int[]{1, 2, 3, 4}), "Expected value: {1, 4}");
    }

    @Test
    public void testMakeEnds2() {
        assertArrayEquals(new int[]{7, 2}, MakeEnds.makeEnds(new int[]{7, 4, 6, 2}), "Expected value: {7, 2}");
    }

    @Test
    public void testMakeEnds3() {
        assertArrayEquals(new int[]{1, 3}, MakeEnds.makeEnds(new int[]{1, 2, 2, 2, 2, 2, 2, 3}), "Expected value: {1, 3}");
    }

    @Test
    public void testMakeEnds4() {
        assertArrayEquals(new int[]{7, 4}, MakeEnds.makeEnds(new int[]{7, 4}), "Expected value: {7, 4}");
    }

    @Test
    public void testMakeEnds5() {
        assertArrayEquals(new int[]{7, 7}, MakeEnds.makeEnds(new int[]{7}), "Expected value: {7, 7}");
    }

    @Test
    public void testMakeEnds6() {
        assertArrayEquals(new int[]{1, 3}, MakeEnds.makeEnds(new int[]{1, 2, 3}), "Expected value: {1, 3}");
    }

    @Test
    public void testMakeEnds7() {
        assertArrayEquals(new int[]{1, 3}, MakeEnds.makeEnds(new int[]{1, 2, 3}), "Expected value: {1, 3}");
    }

}
