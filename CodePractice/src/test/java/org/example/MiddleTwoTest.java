package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleTwoTest {

    @Test
    public void testMiddletwo0() {
        assertEquals("ri", MiddleTwo.middleTwo("string"), "Expected value: ri" );
    }

    @Test
    public void testMiddletwo1() {
        assertEquals("od", MiddleTwo.middleTwo("code"), "Expected value: od" );
    }

    @Test
    public void testMiddletwo2() {
        assertEquals("ct", MiddleTwo.middleTwo("Practice"), "Expected value: ct" );
    }

    @Test
    public void testMiddletwo3() {
        assertEquals("ab", MiddleTwo.middleTwo("ab"), "Expected value: ab" );
    }

    @Test
    public void testMiddletwo4() {
        assertEquals("45", MiddleTwo.middleTwo("0123456789"), "Expected value: 45" );
    }


}
