package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastCharsTest {

    @Test
    public void testLastChars0() {
        assertEquals("ls", LastChars.lastChars("last", "chars"), "Expected value: ls");
    }

    @Test
    public void testLastChars1() {
        assertEquals("ya", LastChars.lastChars("yo", "java"), "Expected value: ya");
    }

    @Test
    public void testLastChars2() {
        assertEquals("h@", LastChars.lastChars("hi", ""), "Expected value: h@");
    }

    @Test
    public void testLastChars3() {
        assertEquals("@o", LastChars.lastChars("", "hello"), "Expected value: @o");
    }

    @Test
    public void testLastChars4() {
        assertEquals("@@", LastChars.lastChars("", ""), "Expected value: @@");
    }

    @Test
    public void testLastChars5() {
        assertEquals("ki", LastChars.lastChars("kitten", "hi"), "Expected value: ki");
    }

    @Test
    public void testLastChars6() {
        assertEquals("kp", LastChars.lastChars("k", "zip"), "Expected value: kp");
    }

    @Test
    public void testLastChars7() {
        assertEquals("k@", LastChars.lastChars("kitten", ""), "Expected value: k@");
    }

    @Test
    public void testLastChars8() {
        assertEquals("kp", LastChars.lastChars("kitten", "zip"), "Expected value: kp");
    }

}
