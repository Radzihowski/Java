package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxMod5Test {

    @Test
    public void testMaxMod50() {
        assertEquals( 3, MaxMod5.maxMod5(2, 3), "Expected value: 3");
    }

    @Test
    public void testMaxMod51() {
        assertEquals( 6, MaxMod5.maxMod5(6, 2), "Expected value: 6");
    }

    @Test
    public void testMaxMod52() {
        assertEquals( 3, MaxMod5.maxMod5(3, 2), "Expected value: 3");
    }

    @Test
    public void testMaxMod53() {
        assertEquals( 12, MaxMod5.maxMod5(8, 12), "Expected value: 12");
    }

    @Test
    public void testMaxMod54() {
        assertEquals( 7, MaxMod5.maxMod5(7, 12), "Expected value: 7");
    }

    @Test
    public void testMaxMod55() {
        assertEquals( 6, MaxMod5.maxMod5(11, 6), "Expected value: 6");
    }

    @Test
    public void testMaxMod56() {
        assertEquals( 2, MaxMod5.maxMod5(2, 7), "Expected value: 2");
    }

    @Test
    public void testMaxMod57() {
        assertEquals( 0, MaxMod5.maxMod5(7, 7), "Expected value: 0");
    }

    @Test
    public void testMaxMod58() {
        assertEquals( 9, MaxMod5.maxMod5(9, 1), "Expected value: 9");
    }

    @Test
    public void testMaxMod59() {
        assertEquals( 9, MaxMod5.maxMod5(9, 14), "Expected value: 9");
    }

    @Test
    public void testMaxMod510() {
        assertEquals( 2, MaxMod5.maxMod5(1, 2), "Expected value: 2");
    }
}
