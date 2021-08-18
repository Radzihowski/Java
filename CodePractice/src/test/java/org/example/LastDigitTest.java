package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastDigitTest {

    @Test
    public void testLastDigit0() {
        assertEquals(true, LastDigit.lastDigit(23, 19, 13), "Expected value: true");
    }

    @Test
    public void testLastDigit1() {
        assertEquals(false, LastDigit.lastDigit(23, 19, 12), "Expected value: false");
    }

    @Test
    public void testLastDigit2() {
        assertEquals(true, LastDigit.lastDigit(23, 19, 3), "Expected value: true");
    }

    @Test
    public void testLastDigit3() {
        assertEquals(true, LastDigit.lastDigit(23, 19, 39), "Expected value: true");
    }

    @Test
    public void testLastDigit4() {
        assertEquals(false, LastDigit.lastDigit(1, 2, 3), "Expected value: false");
    }

    @Test
    public void testLastDigit5() {
        assertEquals(true, LastDigit.lastDigit(1, 1, 2), "Expected value: true");
    }

    @Test
    public void testLastDigit6() {
        assertEquals(true, LastDigit.lastDigit(1, 2, 2), "Expected value: true");
    }

    @Test
    public void testLastDigit7() {
        assertEquals(false, LastDigit.lastDigit(14, 25, 43), "Expected value: false");
    }

    @Test
    public void testLastDigit8() {
        assertEquals(true, LastDigit.lastDigit(14, 25, 45), "Expected value: true");
    }

    @Test
    public void testLastDigit9() {
        assertEquals(false, LastDigit.lastDigit(248, 106, 1002), "Expected value: false");
    }

    @Test
    public void testLastDigit10() {
        assertEquals(true, LastDigit.lastDigit(248, 106, 1008), "Expected value: true");
    }

    @Test
    public void testLastDigit11() {
        assertEquals(true, LastDigit.lastDigit(10, 11, 20), "Expected value: true");
    }

    @Test
    public void testLastDigit12() {
        assertEquals(true, LastDigit.lastDigit(0, 11, 0), "Expected value: true");
    }
}
