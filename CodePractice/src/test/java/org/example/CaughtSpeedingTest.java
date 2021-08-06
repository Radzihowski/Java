package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaughtSpeedingTest {

    @Test
    public void testCaughtSpeeding0() {
        assertEquals( 0, CaughtSpeeding.coughtSpeeding(60, false), "Expected value: 0");
    }

    @Test
    public void testCaughtSpeeding1() {
        assertEquals( 1, CaughtSpeeding.coughtSpeeding(65, false), "Expected value: 1");
    }

    @Test
    public void testCaughtSpeeding2() {
        assertEquals( 0, CaughtSpeeding.coughtSpeeding(65, true), "Expected value: 0");
    }

    @Test
    public void testCaughtSpeeding3() {
        assertEquals( 1, CaughtSpeeding.coughtSpeeding(80, false), "Expected value: 1");
    }

    @Test
    public void testCaughtSpeeding4() {
        assertEquals( 2, CaughtSpeeding.coughtSpeeding(85, false), "Expected value: 2");
    }

    @Test
    public void testCaughtSpeeding5() {
        assertEquals( 1, CaughtSpeeding.coughtSpeeding(85, true), "Expected value: 1");
    }

    @Test
    public void testCaughtSpeeding6() {
        assertEquals( 1, CaughtSpeeding.coughtSpeeding(70, false), "Expected value: 1");
    }

    @Test
    public void testCaughtSpeeding7() {
        assertEquals( 1, CaughtSpeeding.coughtSpeeding(75, false), "Expected value: 1");
    }

    @Test
    public void testCaughtSpeeding8() {
        assertEquals( 1, CaughtSpeeding.coughtSpeeding(75, true), "Expected value: 1");
    }

    @Test
    public void testCaughtSpeeding9() {
        assertEquals( 0, CaughtSpeeding.coughtSpeeding(40, false), "Expected value: 0");
    }

    @Test
    public void testCaughtSpeeding10() {
        assertEquals( 0, CaughtSpeeding.coughtSpeeding(40, true), "Expected value: 0");
    }

    @Test
    public void testCaughtSpeeding11() {
        assertEquals( 2, CaughtSpeeding.coughtSpeeding(90, false), "Expected value: 2");
    }
}
