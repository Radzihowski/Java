package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringYakTest {

    @Test
    public void testStringYak() {
        assertEquals("pak", StringYak.stringYak("yakpak"), "Expected value: pak");
    }

    @Test
    public void testStringYak1() {
        assertEquals("pak", StringYak.stringYak("pakyak"), "Expected value: pak");
    }

    @Test
    public void testStringYak2() {
        assertEquals("123ya", StringYak.stringYak("yak123ya"), "Expected value: 123ya");
    }

    @Test
    public void testStringYak3() {
        assertEquals("", StringYak.stringYak("yak"), "Expected value: ");
    }

    @Test
    public void testStringYak4() {
        assertEquals("xxx", StringYak.stringYak("yakxxxyak"), "Expected value: xxx");
    }

    @Test
    public void testStringYak5() {
        assertEquals("HiHi", StringYak.stringYak("HiyakHi"), "Expected value: HiHi");
    }

    @Test
    public void testStringYak6() {
        assertEquals("xxxyyzzz", StringYak.stringYak("xxxyakyyyakzzz"), "Expected value: xxxyyzzz");
    }

}
