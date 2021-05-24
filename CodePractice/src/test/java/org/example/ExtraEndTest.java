package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtraEndTest {

    @Test
    public void testExtraEnd() {
        assertEquals("lololo",ExtraEnd.extraEnd("Hello"), "Expected value: lololo" );
    }

    @Test
    public void testExtraEnd1() {
        assertEquals("ababab",ExtraEnd.extraEnd("Hello"), "Expected value: ababab" );
    }

    @Test
    public void testExtraEnd2() {
        assertEquals("HiHiHi",ExtraEnd.extraEnd("Hi"), "Expected value: HiHiHi" );
    }

    @Test
    public void testExtraEnd3() {
        assertEquals("dydydy",ExtraEnd.extraEnd("Candy"), "Expected value: dydydy" );
    }

    @Test
    public void testExtraEnd4() {
        assertEquals("dedede",ExtraEnd.extraEnd("Code"), "Expected value: dedede" );
    }
}
