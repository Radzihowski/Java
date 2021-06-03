package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Left2Test {

    @Test
    public void testLeft20() {
        assertEquals("lloHe", Left2.left2("Hello"), "Expected value: lloHe");
    }

    @Test
    public void testLeft21() {
        assertEquals("lloHe", Left2.left2("Hello"), "Expected value: lloHe");
    }

    @Test
    public void testLeft22() {
        assertEquals("vaja", Left2.left2("java"), "Expected value: vaja");
    }

    @Test
    public void testLeft23() {
        assertEquals("Hi", Left2.left2("Hi"), "Expected value: Hi");
    }

    @Test
    public void testLeft24() {
        assertEquals("deco", Left2.left2("code"), "Expected value: deco");
    }

    @Test
    public void testLeft25() {
        assertEquals("tca", Left2.left2("cat"), "Expected value: tca");
    }

    @Test
    public void testLeft26() {
        assertEquals("34512", Left2.left2("12345"), "Expected value: 34512");
    }

    @Test
    public void testLeft27() {
        assertEquals("ocolateCh", Left2.left2("Chocolate"), "Expected value: ocolateCh");
    }

    @Test
    public void testLeft28() {
        assertEquals("icksbr", Left2.left2("bricks"), "Expected value: icksbr");
    }

}

