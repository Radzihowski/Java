package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleThreeTest {

    @Test
    public void testMiddleThree0() {
        assertEquals("and", MiddleThree.middleThree("Candy"), "Expected value: and");
    }

    @Test
    public void testMiddleThree1() {
        assertEquals("and", MiddleThree.middleThree("and"), "Expected value: and");
    }

    @Test
    public void testMiddleThree2() {
        assertEquals("lvi", MiddleThree.middleThree("solving"), "Expected value: lvi");
    }

    @Test
    public void testMiddleThree3() {
        assertEquals("yet", MiddleThree.middleThree("Hi yet Hi"), "Expected value: yet");
    }

    @Test
    public void testMiddleThree4() {
        assertEquals("yet", MiddleThree.middleThree("java yet java"), "Expected value: yet");
    }

    @Test
    public void testMiddleThree5() {
        assertEquals("col", MiddleThree.middleThree("Chocolate"), "Expected value: col");
    }

    @Test
    public void testMiddleThree6() {
        assertEquals("xyz", MiddleThree.middleThree("XabcxyzabcX"), "Expected value: xyz");
    }
}
