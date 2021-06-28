package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Double23Test {

    @Test
    public void testDouble230() {
        assertEquals( true, Double23.double23(new int[]{2, 2}), "Expected value: true");
    }

    @Test
    public void testDouble231() {
        assertEquals( true, Double23.double23(new int[]{3, 3}), "Expected value: true");
    }

    @Test
    public void testDouble232() {
        assertEquals( false, Double23.double23(new int[]{2, 3}), "Expected value: false");
    }

    @Test
    public void testDouble233() {
        assertEquals( false, Double23.double23(new int[]{3, 2}), "Expected value: false");
    }

    @Test
    public void testDouble234() {
        assertEquals( false, Double23.double23(new int[]{4, 5}), "Expected value: false");
    }

    @Test
    public void testDouble235() {
        assertEquals( false, Double23.double23(new int[]{2}), "Expected value: false");
    }

    @Test
    public void testDouble236() {
        assertEquals( false, Double23.double23(new int[]{3}), "Expected value: false");
    }

    @Test
    public void testDouble237() {
        assertEquals( false, Double23.double23(new int[]{}), "Expected value: false");
    }

    @Test
    public void testDouble238() {
        assertEquals( false, Double23.double23(new int[]{3, 4}), "Expected value: false");
    }
}
