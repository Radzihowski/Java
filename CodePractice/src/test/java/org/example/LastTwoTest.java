package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LastTwoTest {

    @Test
    public void testLastTwo0() {
        assertEquals("codign", LastTwo.lastTwo("coding"), "Expected value: codign");
    }

    @Test
    public void testLastTwo1() {
        assertEquals("cta", LastTwo.lastTwo("cat"), "Expected value: cta");
    }

    @Test
    public void testLastTwo2() {
        assertEquals("ba", LastTwo.lastTwo("ab"), "Expected value: ba");
    }

    @Test
    public void testLastTwo3() {
        assertEquals("a", LastTwo.lastTwo("a"), "Expected value: a");
    }

    @Test
    public void testLastTwo4() {
        assertEquals("", LastTwo.lastTwo(""), "Expected value: ");
    }

}
