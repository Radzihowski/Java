package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Love6Test {

    @Test
    public void testLove60() {
        assertEquals( true, Love6.love6(6, 4), "Expected value: true");
    }

    @Test
    public void testLove61() {
        assertEquals( false, Love6.love6(4, 5), "Expected value: false");
    }

    @Test
    public void testLove62() {
        assertEquals( true, Love6.love6(1, 5), "Expected value: true");
    }

    @Test
    public void testLove63() {
        assertEquals( true, Love6.love6(1, 6), "Expected value: true");
    }

    @Test
    public void testLove64() {
        assertEquals( false, Love6.love6(1, 8), "Expected value: false");
    }

    @Test
    public void testLove65() {
        assertEquals( true, Love6.love6(1, 7), "Expected value: true");
    }

    @Test
    public void testLove66() {
        assertEquals( false, Love6.love6(7, 5), "Expected value: false");
    }

    @Test
    public void testLove67() {
        assertEquals( true, Love6.love6(8, 2), "Expected value: true");
    }

    @Test
    public void testLove68() {
        assertEquals( true, Love6.love6(6, 6), "Expected value: true");
    }

    @Test
    public void testLove69() {
        assertEquals( false, Love6.love6(-6, 2), "Expected value: false");
    }

    @Test
    public void testLove610() {
        assertEquals( true, Love6.love6(-4, -10), "Expected value: true");
    }

    @Test
    public void testLove611() {
        assertEquals( false, Love6.love6(-7, 1), "Expected value: false");
    }

    @Test
    public void testLove612() {
        assertEquals( true, Love6.love6(7, -1), "Expected value: true");
    }

    @Test
    public void testLove613() {
        assertEquals( true, Love6.love6(-6, 12), "Expected value: true");
    }

    @Test
    public void testLove614() {
        assertEquals( false, Love6.love6(-2, -4), "Expected value: false");
    }

    @Test
    public void testLove615() {
        assertEquals( true, Love6.love6(7, 1), "Expected value: true");
    }

    @Test
    public void testLove616() {
        assertEquals( false, Love6.love6(0, 9), "Expected value: false");
    }

    @Test
    public void testLove617() {
        assertEquals( false, Love6.love6(8, 3), "Expected value: false");
    }

    @Test
    public void testLove618() {
        assertEquals( true, Love6.love6(3, 3), "Expected value: true");
    }

    @Test
    public void testLove619() {
        assertEquals( false, Love6.love6(3, 4), "Expected value: false");
    }

}
