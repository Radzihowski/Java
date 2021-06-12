package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtFirstTest {

    @Test
    public void testAtFirst0() {
        assertEquals("he", AtFirst.atFirst("hello"), "Expected value: he");
    }

    @Test
    public void testAtFirst1() {
        assertEquals("hi", AtFirst.atFirst("hi"), "Expected value: hi");
    }

    @Test
    public void testAtFirst2() {
        assertEquals("h@", AtFirst.atFirst("h"), "Expected value: h@");
    }

    @Test
    public void testAtFirst3() {
        assertEquals("@@", AtFirst.atFirst(""), "Expected value: @@");
    }

    @Test
    public void testAtFirst4() {
        assertEquals("ki", AtFirst.atFirst("kitten"), "Expected value: ki");
    }

    @Test
    public void testAtFirst5() {
        assertEquals("ja", AtFirst.atFirst("java"), "Expected value: ja");
    }

    @Test
    public void testAtFirst6() {
        assertEquals("j@", AtFirst.atFirst("j"), "Expected value: j@");
    }
}

