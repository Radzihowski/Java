package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxTripleTest {

    @Test
    public void testMaxTriple0() {
        assertEquals(3, MaxTriple.maxTriple(new int[]{1, 2, 3}), "Expected value: 3");
    }

    @Test
    public void testMaxTriple1() {
        assertEquals(5, MaxTriple.maxTriple(new int[]{1, 5, 3}), "Expected value: 5");
    }

    @Test
    public void testMaxTriple2() {
        assertEquals(5, MaxTriple.maxTriple(new int[]{5, 2, 3}), "Expected value: 5");
    }

    @Test
    public void testMaxTriple3() {
        assertEquals(3, MaxTriple.maxTriple(new int[]{1, 2, 3, 1, 1}), "Expected value: 3");
    }

    @Test
    public void testMaxTriple4() {
        assertEquals(5, MaxTriple.maxTriple(new int[]{1, 7, 3, 1, 5}), "Expected value: 5");
    }

    @Test
    public void testMaxTriple5() {
        assertEquals(5, MaxTriple.maxTriple(new int[]{5, 1, 3, 7, 1}), "Expected value: 5");
    }

    @Test
    public void testMaxTriple6() {
        assertEquals(5, MaxTriple.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 1}), "Expected value: 5");
    }

    @Test
    public void testMaxTriple7() {
        assertEquals(9, MaxTriple.maxTriple(new int[]{5, 1, 7, 9, 7, 8, 1}), "Expected value: 9");
    }

    @Test
    public void testMaxTriple8() {
        assertEquals(9, MaxTriple.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 9}), "Expected value: 9");
    }

    @Test
    public void testMaxTriple9() {
        assertEquals(5, MaxTriple.maxTriple(new int[]{2, 2, 5, 1, 1}), "Expected value: 5");
    }
}
