package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Right2Test {
    @Test
    public void testRight20() {
        assertEquals("loHel", Right2.right2("Hello"), "Expected value: loHel");
    }

    @Test
    public void testRight21() {
        assertEquals("vaja", Right2.right2("java"), "Expected value: vaja");
    }

    @Test
    public void testRight22() {
        assertEquals("Hi", Right2.right2("Hi"), "Expected value: Hi");
    }

    @Test
    public void testRight23() {
        assertEquals("deco", Right2.right2("code"), "Expected value: deco");
    }

    @Test
    public void testRight24() {
        assertEquals("atc", Right2.right2("cat"), "Expected value: atc");
    }

    @Test
    public void testRight25() {
        assertEquals("45123", Right2.right2("12345"), "Expected value: 45123");
    }
 }
