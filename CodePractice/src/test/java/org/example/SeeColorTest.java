package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SeeColorTest {

    @Test
    public void testSeeColor0() {
        assertEquals("red", SeeColor.seeColor("redxx"), "Expected value: red");
    }

    @Test
    public void testSeeColor1() {
        assertEquals("", SeeColor.seeColor("xxred"), "Expected value: ");
    }

    @Test
    public void testSeeColor2() {
        assertEquals("blue", SeeColor.seeColor("blueTimes"), "Expected value: blue");
    }

    @Test
    public void testSeeColor3() {
        assertEquals("", SeeColor.seeColor("NoColor"), "Expected value: ");
    }

    @Test
    public void testSeeColor4() {
        assertEquals("red", SeeColor.seeColor("red"), "Expected value: red");
    }

    @Test
    public void testSeeColor5() {
        assertEquals("", SeeColor.seeColor("re"), "Expected value: ");
    }

    @Test
    public void testSeeColor6() {
        assertEquals("", SeeColor.seeColor("blu"), "Expected value: ");
    }

    @Test
    public void testSeeColor7() {
        assertEquals("blue", SeeColor.seeColor("blue"), "Expected value: blue");
    }

    @Test
    public void testSeeColor8() {
        assertEquals("", SeeColor.seeColor("a"), "Expected value: ");
    }

    @Test
    public void testSeeColor9() {
        assertEquals("", SeeColor.seeColor(""), "Expected value: ");
    }

    @Test
    public void testSeeColor10() {
        assertEquals("", SeeColor.seeColor("xyzred"), "Expected value: ");
    }

}
