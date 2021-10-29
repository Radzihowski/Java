package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShareDigitTest {

    @Test
    public void testShareDigit0() {
        assertEquals(true, ShareDigit.shareDigit(12, 23), "Expected value: true" );
    }

    @Test
    public void testShareDigit1() {
        assertEquals(false, ShareDigit.shareDigit(12, 43), "Expected value: false" );
    }

    @Test
    public void testShareDigit2() {
        assertEquals(false, ShareDigit.shareDigit(12, 44), "Expected value: false" );
    }

    @Test
    public void testShareDigit3() {
        assertEquals(true, ShareDigit.shareDigit(23, 12), "Expected value: true" );
    }

    @Test
    public void testShareDigit4() {
        assertEquals(true, ShareDigit.shareDigit(23, 39), "Expected value: true" );
    }

    @Test
    public void testShareDigit5() {
        assertEquals(false, ShareDigit.shareDigit(23, 19), "Expected value: false" );
    }

    @Test
    public void testShareDigit6() {
        assertEquals(true, ShareDigit.shareDigit(30, 90), "Expected value: true" );
    }

    @Test
    public void testShareDigit7() {
        assertEquals(false, ShareDigit.shareDigit(30, 91), "Expected value: false" );
    }

    @Test
    public void testShareDigit8() {
        assertEquals(true, ShareDigit.shareDigit(55, 55), "Expected value: true" );
    }

    @Test
    public void testShareDigit9() {
        assertEquals(false, ShareDigit.shareDigit(55, 44), "Expected value: false" );
    }
}
