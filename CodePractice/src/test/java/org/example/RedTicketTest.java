package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedTicketTest {

    @Test
    public void testRedTicket0() {
        assertEquals( 10, RedTicket.redTicket(2, 2, 2), "Expected value: 10");
    }

    @Test
    public void testRedTicket1() {
        assertEquals( 0, RedTicket.redTicket(2, 2, 1), "Expected value: 0");
    }

    @Test
    public void testRedTicket2() {
        assertEquals( 5, RedTicket.redTicket(0, 0, 0), "Expected value: 5");
    }

    @Test
    public void testRedTicket3() {
        assertEquals( 1, RedTicket.redTicket(2, 0, 0), "Expected value: 1");
    }

    @Test
    public void testRedTicket4() {
        assertEquals( 5, RedTicket.redTicket(1, 1, 1), "Expected value: 5");
    }

    @Test
    public void testRedTicket5() {
        assertEquals( 0, RedTicket.redTicket(1, 2, 1), "Expected value: 0");
    }

    @Test
    public void testRedTicket6() {
        assertEquals( 1, RedTicket.redTicket(1, 2, 0), "Expected value: 1");
    }

    @Test
    public void testRedTicket7() {
        assertEquals( 1, RedTicket.redTicket(0, 2, 2), "Expected value: 1");
    }

    @Test
    public void testRedTicket8() {
        assertEquals( 1, RedTicket.redTicket(1, 2, 2), "Expected value: 1");
    }

    @Test
    public void testRedTicket9() {
        assertEquals( 0, RedTicket.redTicket(0, 2, 0), "Expected value: 0");
    }

    @Test
    public void testRedTicket10() {
        assertEquals( 0, RedTicket.redTicket(1, 1, 2), "Expected value: 0");
    }
}
