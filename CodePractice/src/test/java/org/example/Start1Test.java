package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Start1Test {

    @Test
    public void testStart10() {
        assertEquals( 2, Start1.start1(new int[]{1, 2, 3}, new int[]{1, 3}), "Expected value: 2");
    }

    @Test
    public void testStart11() {
        assertEquals( 1, Start1.start1(new int[]{7, 2, 3}, new int[]{1}), "Expected value: 1");
    }

    @Test
    public void testStart12() {
        assertEquals( 1, Start1.start1(new int[]{1, 2}, new int[]{}), "Expected value: 1");
    }

    @Test
    public void testStart13() {
        assertEquals( 1, Start1.start1(new int[]{}, new int[]{1, 2}), "Expected value: 1");
    }

    @Test
    public void testStart14() {
        assertEquals( 0, Start1.start1(new int[]{7}, new int[]{}), "Expected value: 0");
    }

    @Test
    public void testStart15() {
        assertEquals( 1, Start1.start1(new int[]{7}, new int[]{1}), "Expected value: 1");
    }

    @Test
    public void testStart16() {
        assertEquals( 2, Start1.start1(new int[]{1}, new int[]{1}), "Expected value: 2");
    }

    @Test
    public void testStart17() {
        assertEquals( 0, Start1.start1(new int[]{7}, new int[]{8}), "Expected value: 0");
    }

    @Test
    public void testStart18() {
        assertEquals( 0, Start1.start1(new int[]{}, new int[]{}), "Expected value: 0");
    }

    @Test
    public void testStart19() {
        assertEquals( 2, Start1.start1(new int[]{1, 3}, new int[]{1}), "Expected value: 2");
    }
}
