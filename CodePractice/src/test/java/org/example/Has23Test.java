package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Has23Test {

    @Test
    public void testHas230() {
        assertEquals(true, Has23.has23(new int[]{2, 5}), "Expected value: true");
    }

    @Test
    public void testHas231() {
        assertEquals(true, Has23.has23(new int[]{4, 3}), "Expected value: true");
    }

    @Test
    public void testHas232() {
        assertEquals(false, Has23.has23(new int[]{4, 5}), "Expected value: false");
    }

    @Test
    public void testHas233() {
        assertEquals(true, Has23.has23(new int[]{2, 2}), "Expected value: true");
    }

    @Test
    public void testHas234() {
        assertEquals(true, Has23.has23(new int[]{3, 2}), "Expected value: true");
    }

    @Test
    public void testHas235() {
        assertEquals(true, Has23.has23(new int[]{3, 3}), "Expected value: true");
    }

    @Test
    public void testHas236() {
        assertEquals(false, Has23.has23(new int[]{7, 7}), "Expected value: false");
    }

    @Test
    public void testHas237() {
        assertEquals(true, Has23.has23(new int[]{3, 9}), "Expected value: true");
    }

    @Test
    public void testHas238() {
        assertEquals(false, Has23.has23(new int[]{9, 5}), "Expected value: false");
    }
}
