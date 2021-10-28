package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlueTicketTest {

    @Test
    public void testBlueTicket0() {
        assertEquals(10, BlueTicket.blueTicket(9, 1, 0), "Expected value: 10" );
    }

    @Test
    public void testBlueTicket1() {
        assertEquals(0, BlueTicket.blueTicket(9, 2, 0), "Expected value: 0" );
    }

    @Test
    public void testBlueTicket2() {
        assertEquals(10, BlueTicket.blueTicket(6, 1, 4), "Expected value: 10" );
    }

    @Test
    public void testBlueTicket3() {
        assertEquals(0, BlueTicket.blueTicket(6, 1, 5), "Expected value: 0" );
    }

    @Test
    public void testBlueTicket4() {
        assertEquals(10, BlueTicket.blueTicket(10, 0, 0), "Expected value: 10" );
    }

    @Test
    public void testBlueTicket5() {
        assertEquals(5, BlueTicket.blueTicket(15, 0, 5), "Expected value: 5" );
    }

    @Test
    public void testBlueTicket6() {
        assertEquals(10, BlueTicket.blueTicket(5, 15, 5), "Expected value: 10" );
    }

    @Test
    public void testBlueTicket7() {
        assertEquals(5, BlueTicket.blueTicket(4, 11, 1), "Expected value: 5" );
    }

    @Test
    public void testBlueTicket8() {
        assertEquals(5, BlueTicket.blueTicket(13, 2, 3), "Expected value: 5" );
    }

    @Test
    public void testBlueTicket9() {
        assertEquals(0, BlueTicket.blueTicket(8, 4, 3), "Expected value: 0" );
    }

    @Test
    public void testBlueTicket10() {
        assertEquals(10, BlueTicket.blueTicket(8, 4, 2), "Expected value: 10" );
    }

    @Test
    public void testBlueTicket11() {
        assertEquals(0, BlueTicket.blueTicket(8, 4, 1), "Expected value: 0" );
    }

}
