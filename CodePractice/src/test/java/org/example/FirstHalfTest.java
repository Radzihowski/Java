package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstHalfTest {

    @Test
    public void testFirstHalf() {
        assertEquals("Woo", FirstHalf.firstHalf("WooHoo"), "Expected value: Woo");
    }

    @Test
    public void testFirstHalf1() {
        assertEquals("Hello", FirstHalf.firstHalf("HelloThere"), "Expected value: Hello");
    }

    @Test
    public void testFirstHalf2() {
        assertEquals("abc", FirstHalf.firstHalf("abcdef"), "Expected value: abc");
    }

    @Test
    public void testFirstHalf3() {
        assertEquals("a", FirstHalf.firstHalf("ab"), "Expected value: a");
    }

    @Test
    public void testFirstHalf4() {
        assertEquals("", FirstHalf.firstHalf(""), "Expected value: ");
    }

    @Test
    public void testFirstHalf5() {
        assertEquals("01234", FirstHalf.firstHalf("0123456789"), "Expected value: 01234");
    }

    @Test
    public void testFirstHalf6() {
        assertEquals("kit", FirstHalf.firstHalf("kitten"), "Expected value: kit");
    }
}
