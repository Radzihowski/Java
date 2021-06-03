package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonStartTest {

    @Test
    public void testNonStart0() {
        assertEquals("ellohere", NonStart.nonStart("Hello", "There"), "Expected value: ellohere");
    }

    @Test
    public void testNonStart1() {
        assertEquals("avaode", NonStart.nonStart("java", "code"), "Expected value: avaode");
    }

    @Test
    public void testNonStart2() {
        assertEquals("hotlava", NonStart.nonStart("shotl", "java"), "Expected value: hotlava");
    }

    @Test
    public void testNonStart3() {
        assertEquals("by", NonStart.nonStart("ab", "xy"), "Expected value: by");
    }

    @Test
    public void testNonStar4() {
        assertEquals("b", NonStart.nonStart("ab", "x"), "Expected value: b");
    }

    @Test
    public void testNonStart5() {
        assertEquals("c", NonStart.nonStart("x", "ac"), "Expected value: c");
    }

    @Test
    public void testNonStart6() {
        assertEquals("", NonStart.nonStart("a", "x"), "Expected value: ");
    }

    @Test
    public void testNonStart7() {
        assertEquals("itat", NonStart.nonStart("kit", "kat"), "Expected value: itat");
    }

    @Test
    public void testNonStart8() {
        assertEquals("artart", NonStart.nonStart("mart", "dart"), "Expected value: artart");
    }
}
