package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheEndTest {

    @Test
    public void testTheEnd0() {
        assertEquals("H", TheEnd.theEnd("Hello", true), "Expected value: H");
    }

    @Test
    public void testTheEnd1() {
        assertEquals("o", TheEnd.theEnd("Hello", false), "Expected value: o");
    }

    @Test
    public void testTheEnd2() {
        assertEquals("o", TheEnd.theEnd("oh", true), "Expected value: o");
    }

    @Test
    public void testTheEnd3() {
        assertEquals("h", TheEnd.theEnd("oh", false), "Expected value: h");
    }

    @Test
    public void testTheEnd4() {
        assertEquals("x", TheEnd.theEnd("x", true), "Expected value: x");
    }

    @Test
    public void testTheEnd5() {
        assertEquals("x", TheEnd.theEnd("x", false), "Expected value: x");
    }

    @Test
    public void testTheEnd6() {
        assertEquals("j", TheEnd.theEnd("java", true), "Expected value: j");
    }

    @Test
    public void testTheEnd7() {
        assertEquals("e", TheEnd.theEnd("chocolate", false), "Expected value: e");
    }

    @Test
    public void testTheEnd8() {
        assertEquals("1", TheEnd.theEnd("1234", true), "Expected value: 1");
    }

    @Test
    public void testTheEnd9() {
        assertEquals("e", TheEnd.theEnd("code", false), "Expected value: e");
    }
}
