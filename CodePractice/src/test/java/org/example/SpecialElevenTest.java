package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialElevenTest {

    @Test
    public void testSpecialEleven0() {
        assertEquals( true, SpecialEleven.specialEleven(22), "Expected value: true");
    }

    @Test
    public void testSpecialEleven1() {
        assertEquals( true, SpecialEleven.specialEleven(23), "Expected value: true");
    }

    @Test
    public void testSpecialEleven2() {
        assertEquals( false, SpecialEleven.specialEleven(24), "Expected value: false");
    }

    @Test
    public void testSpecialEleven3() {
        assertEquals( false, SpecialEleven.specialEleven(21), "Expected value: false");
    }

    @Test
    public void testSpecialEleven4() {
        assertEquals( true, SpecialEleven.specialEleven(11), "Expected value: true");
    }

    @Test
    public void testSpecialEleven5() {
        assertEquals( true, SpecialEleven.specialEleven(12), "Expected value: true");
    }

    @Test
    public void testSpecialEleven6() {
        assertEquals( false, SpecialEleven.specialEleven(10), "Expected value: false");
    }

    @Test
    public void testSpecialEleven7() {
        assertEquals( false, SpecialEleven.specialEleven(9), "Expected value: false");
    }

    @Test
    public void testSpecialEleven8() {
        assertEquals( false, SpecialEleven.specialEleven(8), "Expected value: false");
    }

    @Test
    public void testSpecialEleven9() {
        assertEquals( true, SpecialEleven.specialEleven(0), "Expected value: true");
    }

    @Test
    public void testSpecialEleven10() {
        assertEquals( true, SpecialEleven.specialEleven(1), "Expected value: true");
    }

    @Test
    public void testSpecialEleven11() {
        assertEquals( false, SpecialEleven.specialEleven(2), "Expected value: false");
    }

    @Test
    public void testSpecialEleven12() {
        assertEquals( true, SpecialEleven.specialEleven(121), "Expected value: true");
    }

    @Test
    public void testSpecialEleven13() {
        assertEquals( true, SpecialEleven.specialEleven(122), "Expected value: true");
    }

    @Test
    public void testSpecialEleven14() {
        assertEquals( false, SpecialEleven.specialEleven(123), "Expected value: false");
    }

    @Test
    public void testSpecialEleven15() {
        assertEquals( false, SpecialEleven.specialEleven(46), "Expected value: false");
    }

    @Test
    public void testSpecialEleven16() {
        assertEquals( false, SpecialEleven.specialEleven(49), "Expected value: false");
    }

    @Test
    public void testSpecialEleven17() {
        assertEquals( false, SpecialEleven.specialEleven(52), "Expected value: false");
    }

    @Test
    public void testSpecialEleven18() {
        assertEquals( false, SpecialEleven.specialEleven(54), "Expected value: false");
    }

    @Test
    public void testSpecialEleven19() {
        assertEquals( true, SpecialEleven.specialEleven(55), "Expected value: true");
    }
}
