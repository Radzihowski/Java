package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HasBadTest {

    @Test
    public void testHasBad0() {
        assertEquals(true, HasBad.hasBad("badxx"), "Expected value: true");
    }

    @Test
    public void testHasBad1() {
        assertEquals(true, HasBad.hasBad("xbadxx"), "Expected value: true");
    }

    @Test
    public void testHasBad2() {
        assertEquals(false, HasBad.hasBad("xxbadxx"), "Expected value: false");
    }

    @Test
    public void testHasBad3() {
        assertEquals(false, HasBad.hasBad("code"), "Expected value: false");
    }

    @Test
    public void testHasBad4() {
        assertEquals(true, HasBad.hasBad("bad"), "Expected value: true");
    }

    @Test
    public void testHasBad5() {
        assertEquals(false, HasBad.hasBad("ba"), "Expected value: false");
    }

    @Test
    public void testHasBad6() {
        assertEquals(false, HasBad.hasBad("xba"), "Expected value: false");
    }

    @Test
    public void testHasBad7() {
        assertEquals(true, HasBad.hasBad("xbad"), "Expected value: true");
    }

    @Test
    public void testHasBad8() {
        assertEquals(false, HasBad.hasBad(""), "Expected value: false");
    }

    @Test
    public void testHasBad9() {
        assertEquals(true, HasBad.hasBad("badyy"), "Expected value: true");
    }
}
