package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CigarPartyTest {

    @Test
    public void testCigarParty0() {
        assertEquals( false, CigarParty.cigarParty(30, false), "Expected value: false");
    }

    @Test
    public void testCigarParty1() {
        assertEquals( true, CigarParty.cigarParty(50, true), "Expected value: true");
    }

    @Test
    public void testCigarParty2() {
        assertEquals( true, CigarParty.cigarParty(70, true), "Expected value: true");
    }

    @Test
    public void testCigarParty3() {
        assertEquals( false, CigarParty.cigarParty(30, true), "Expected value: false");
    }

    @Test
    public void testCigarParty4() {
        assertEquals( true, CigarParty.cigarParty(50, true), "Expected value: true");
    }

    @Test
    public void testCigarParty5() {
        assertEquals( true, CigarParty.cigarParty(60, false), "Expected value: true");
    }

    @Test
    public void testCigarParty6() {
        assertEquals( false, CigarParty.cigarParty(61, false), "Expected value: false");
    }

    @Test
    public void testCigarParty7() {
        assertEquals( true, CigarParty.cigarParty(40, false), "Expected value: true");
    }

    @Test
    public void testCigarParty8() {
        assertEquals( false, CigarParty.cigarParty(39, false), "Expected value: false");
    }

    @Test
    public void testCigarParty9() {
        assertEquals( true, CigarParty.cigarParty(40, true), "Expected value: true");
    }

    @Test
    public void testCigarParty10() {
        assertEquals( false, CigarParty.cigarParty(39, true), "Expected value: false");
    }
}
