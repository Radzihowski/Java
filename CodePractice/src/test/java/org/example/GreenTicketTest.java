package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreenTicketTest {

    @Test
    public void testGreenTicket0() {
        assertEquals(0, GreenTicket.greenTicket(1, 2, 3), "Expected value: 0" );
    }

    @Test
    public void testGreenTicket1() {
        assertEquals(20, GreenTicket.greenTicket(2, 2, 2), "Expected value: 20" );
    }

    @Test
    public void testGreenTicket2() {
        assertEquals(10, GreenTicket.greenTicket(1, 1, 2), "Expected value: 10" );
    }

    @Test
    public void testGreenTicket3() {
        assertEquals(10, GreenTicket.greenTicket(2, 1, 1), "Expected value: 10" );
    }

    @Test
    public void testGreenTicket4() {
        assertEquals(10, GreenTicket.greenTicket(1, 2, 1), "Expected value: 10" );
    }

    @Test
    public void testGreenTicket5() {
        assertEquals(0, GreenTicket.greenTicket(3, 2, 1), "Expected value: 0" );
    }

    @Test
    public void testGreenTicket6() {
        assertEquals(20, GreenTicket.greenTicket(0, 0, 0), "Expected value: 20" );
    }

    @Test
    public void testGreenTicket7() {
        assertEquals(10, GreenTicket.greenTicket(2, 0, 0), "Expected value: 10" );
    }

    @Test
    public void testGreenTicket8() {
        assertEquals(0, GreenTicket.greenTicket(0, 9, 10), "Expected value: 0" );
    }

    @Test
    public void testGreenTicket9() {
        assertEquals(10, GreenTicket.greenTicket(0, 10, 0), "Expected value: 10" );
    }

    @Test
    public void testGreenTicket10() {
        assertEquals(20, GreenTicket.greenTicket(9, 9, 9), "Expected value: 20" );
    }

    @Test
    public void testGreenTicket11() {
        assertEquals(10, GreenTicket.greenTicket(9, 0, 9), "Expected value: 10" );
    }
}
