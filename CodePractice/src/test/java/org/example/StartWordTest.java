package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StartWordTest {

    @Test
    public void testStartWord0() {
        assertEquals("hi", StartWord.startWord("hippo", "hi"), "Expected value: hi");
    }

    @Test
    public void testStartWord1() {
        assertEquals("hip", StartWord.startWord("hippo", "xip"), "Expected value: hip");
    }

    @Test
    public void testStartWord2() {
        assertEquals("h", StartWord.startWord("hippo", "i"), "Expected value: h");
    }

    @Test
    public void testStartWord3() {
        assertEquals("", StartWord.startWord("hippo", "ix"), "Expected value: ");
    }

    @Test
    public void testStartWord4() {
        assertEquals("", StartWord.startWord("h", "ix"), "Expected value: ");
    }

    @Test
    public void testStartWord5() {
        assertEquals("", StartWord.startWord("", "i"), "Expected value: ");
    }

    @Test
    public void testStartWord6() {
        assertEquals("hi", StartWord.startWord("hip", "zi"), "Expected value: hi");
    }

    @Test
    public void testStartWord7() {
        assertEquals("hip", StartWord.startWord("hip", "zip"), "Expected value: hip");
    }

    @Test
    public void testStartWord8() {
        assertEquals("", StartWord.startWord("hip", "zig"), "Expected value: ");
    }

    @Test
    public void testStartWord9() {
        assertEquals("h", StartWord.startWord("h", "z"), "Expected value: h");
    }

    @Test
    public void testStartWord10() {
        assertEquals("hippo", StartWord.startWord("hippo", "xippo"), "Expected value: hippo");
    }

    @Test
    public void testStartWord11() {
        assertEquals("", StartWord.startWord("hippo", "xyz"), "Expected value: ");
    }

    @Test
    public void testStartWord12() {
        assertEquals("hip", StartWord.startWord("hippo", "hip"), "Expected value: hip");
    }

    @Test
    public void testStartWord13() {
        assertEquals("kit", StartWord.startWord("kitten", "cit"), "Expected value: kit");
    }

    @Test
    public void testStartWord14() {
        assertEquals("kit", StartWord.startWord("kit", "cit"), "Expected value: kit");
    }
}
